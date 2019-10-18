package com.schoolLife.Controller;


import java.io.IOException;

import java.text.SimpleDateFormat;

import java.util.Date;
import java.util.List;
import java.util.Random;


import javax.servlet.http.HttpServletRequest;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.schoolLife.pojo.Day;
import com.schoolLife.service.DayDictService;

import com.schoolLife.util.OSSClientUtil;

/*
 * 今日信息管理
 */
@Controller
public class DayController {
	@Autowired
	private DayDictService dayDictService;
	//当天查询
	@RequestMapping(method = RequestMethod.POST, value = "/listDangTianDay")
	public @ResponseBody List<Day> daydangtainChaKanList() throws IOException {		
			return dayDictService.selectDangTianDayList();
					
	}
  
	//直接查询
		@RequestMapping(method = RequestMethod.POST, value = "/listloginDay")
		public @ResponseBody List<Day> dayChaKanList() throws IOException {	
			System.out.println(dayDictService.selectDayList());
				return dayDictService.selectDayList();
				
			
		}
	// 查询
	@RequestMapping(method = RequestMethod.POST, value = "/listDay")
	public @ResponseBody List<Day> dayChakan(String teampTime) throws IOException {
        System.out.println(teampTime);
		String str = "";
		if (teampTime != null && teampTime != "") {
			return dayDictService.selectDayListByDateTime(teampTime);
		} else {
			return null;
		}

	}

	// 添加
	@RequestMapping(method = RequestMethod.POST, value = "/addDay")
	@ResponseBody
	
	  public String upload(Day day,HttpServletRequest request,@RequestParam("file")MultipartFile file) throws
	  Exception{ 
		//阿里云工具类的调用
	  OSSClientUtil oSSClientUtil= new OSSClientUtil();
          //返回url给你
	  String url = oSSClientUtil.uploadImg2Oss(file);
	  //获取系统时间并调用
	  SimpleDateFormat df = new  SimpleDateFormat("yyyy-MM-dd");//设置日期格式	 
	  Date date = new Date();
	  String str =df.format(date);	 
	  //生成随机数
		
	  Random random = new Random();
	  int num = random.nextInt(10000);
	  int num2 = random.nextInt(10000);
	  day.setContent_id(num);
	  day.setImg_urlID(num2);
	  day.setImg_url(url);
	  day.setDayId(request.getParameter("dayId"));
	  day.setTitle(request.getParameter("title"));
	  day.setContent(request.getParameter("content"));
	  day.setDayTime(str);

	  dayDictService.addDay(day);
	  
	  return "ok"; 
	 
	
}
	// 删除
	@RequestMapping(method = RequestMethod.POST, value = "/deleteDay")
	@ResponseBody
	public String deleteDay(Integer id) throws IOException {
		dayDictService.deleteDay(id);
		return "ok";

	}

}