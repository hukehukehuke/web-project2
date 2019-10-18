package com.schoolLife.Controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.schoolLife.pojo.Pinlun;
import com.schoolLife.service.PinlunService;
import com.schoolLife.util.HttpRequest;

@Controller
public class PinlunController {
   @Autowired
   private PinlunService pinlunService;
   //评论内容添加
  
   @RequestMapping(method = RequestMethod.GET, value="/addPinlun")
   @ResponseBody
   public String pinglun(Pinlun pinlun,HttpServletRequest request,String puserId,String plYeMianId,String plContent,String plunTime)throws Exception{
	   SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	   Date date = new Date();
	   String str = sdf.format(date);
	   pinlun.setPlunTime(str);
	   pinlun.setPuserId(request.getParameter("puserId"));
	   pinlun.setPlYeMianId(request.getParameter("plYeMianId"));
	   pinlun.setPlContent(request.getParameter("plContent"));
	   pinlunService.addPL(pinlun);
	   return "ok";
   }
   
   //评论内容显示
   @RequestMapping(method = RequestMethod.POST,  value="/listPinlun")
   @ResponseBody
   public List<Pinlun> listPinlun() {
	   
	   return pinlunService.listPL();
	   
   }
   

}
