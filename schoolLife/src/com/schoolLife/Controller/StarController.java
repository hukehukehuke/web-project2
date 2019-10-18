package com.schoolLife.Controller;


import java.io.IOException;


import java.util.List;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;


import com.schoolLife.pojo.Star;
import com.schoolLife.service.StarService;
import com.schoolLife.util.OSSClientUtil;

@Controller
public class StarController {
	 
	@Autowired
	private StarService starService;
	
	@RequestMapping(method = RequestMethod.POST, value = "/addStar")
	@ResponseBody
	//添加
	public String star(Star star,HttpServletRequest request,String starTitle,String starUser_id,String starContent,String starTime, String star_img,MultipartFile file) throws Exception{

		//阿里云工具类的调用
		  OSSClientUtil oSSClientUtil= new OSSClientUtil();
	          //返回url给你
		String url = oSSClientUtil.uploadImg2Oss(file);
		star.setStar_img(url);
		star.setStarTitle(request.getParameter("starTitle"));
		star.setStarContent(request.getParameter("starContent"));
		star.setStarTime(request.getParameter("starTime"));
		star.setStarUser_id(request.getParameter("starUser_id"));
		starService.addStar(star);
		return "添加成功";
	}
	//查询
	@RequestMapping(method = RequestMethod.POST, value = "/listStar")
	@ResponseBody
	public List<Star> starChakan(@RequestParam("starTitle") String starTitle) throws Exception{
		System.out.println("2345673245876543");
		System.out.println(starTitle);
		return starService.selectByStarTime(starTitle);
		
	}
	//删除
	@RequestMapping(method = RequestMethod.POST, value = "/deleteStar")
	@ResponseBody
	public String deleteStar(Integer id) throws IOException {
		starService.deleteStar(id);
		return "ok";

	}
}
