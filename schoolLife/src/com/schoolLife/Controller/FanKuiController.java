package com.schoolLife.Controller;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.schoolLife.pojo.FanKui;
import com.schoolLife.service.FanKuiService;

@Controller
public class FanKuiController {
   @Autowired
   private FanKuiService fanKuiService;
   //反馈信息添加
  @RequestMapping(method = RequestMethod.GET, value = "/addfankui")
  @ResponseBody
   public String fanKui(FanKui fanKui,HttpServletRequest request,String fanKuiId,String fanKuiContent)throws Exception {
	  SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	  Date date = new Date();
	  String str = sdf.format(date);
	  fanKui.setFanKuiTime(str);
	  System.out.println("*********");
	  System.out.println(request.getParameter("fanKuiContent"));
	  fanKui.setFanKuiId(request.getParameter("fanKuiId"));
	  fanKui.setFanKuiContent(request.getParameter("fanKuiContent"));
	  fanKuiService.addfanKui(fanKui);
	  return "ok";
  }
}
