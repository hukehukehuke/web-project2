package com.schoolLife.Controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.schoolLife.pojo.User;
import com.schoolLife.service.UserService;
import com.schoolLife.util.OSSClientUtil;

@Controller
public class UserCotroller {
   @Autowired
   private UserService userService;
   @RequestMapping(method = RequestMethod.POST, value = "/addUser")
   @ResponseBody
   public String addUser(@RequestBody User user,HttpServletRequest request,String userOpenid,String userqianming,@RequestParam("file")MultipartFile  file)throws Exception{
    OSSClientUtil oSSClientUtil = new OSSClientUtil();
	    //·µ»Øurl¸øÄã
	  String url = oSSClientUtil.uploadImg2Oss(file);
	   SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	   Date date = new Date();
	   String str = sdf.format(date);
	   user.setUserTime(str);
	   System.out.println(request.getParameter("userOpenid"));
	   user.setUserOpenid(request.getParameter("userOpenid"));
	   user.setUserqianming(request.getParameter("userqianming"));
	   
       user.setUser_img(url);
	   userService.addUser(user);
	   return "ok";
   }
}
