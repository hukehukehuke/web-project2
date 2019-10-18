package com.schoolLife.Controller;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.schoolLife.pojo.WeiXin;
import com.schoolLife.service.WeiXinService;
import com.schoolLife.util.HttpURLConnection;
import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;


@Controller
public class weiXinController {
	
	@Autowired
	private WeiXinService weiXinService; 
	String appid="wxe2dba2b474eedc86";
	String secret="0c24034238000505d87fc859f5a43d95";
	
	String url="https://api.weixin.qq.com/sns/jscode2session";
	@RequestMapping(value ="/login")
	public @ResponseBody String getUserMsg(String code) throws org.json.simple.parser.ParseException{
		String params = "appid=" + appid + "&secret=" + secret + "&js_code=" + code +
                "&grant_type=authorization_code";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss");
        Date date = new Date();
        String str = sdf.format(date);
        String result = HttpURLConnection.sendGet(url,params);

        JSONObject json = null;

        String session_key=null;

        String openid = null;

        System.out.println(result);

        try {

             json = (JSONObject) (new JSONParser().parse(result));

            session_key = (String) json.get("session_key");

            openid = (String) json.get("openid");
            

        } catch (ParseException e) {

            e.printStackTrace();

        }
         WeiXin weiXin = new WeiXin();
         weiXin.setCreatTime(str);
         weiXin.setOpenid(openid);  
         weiXinService.addWeiXin(weiXin);
         System.out.println(code);
         System.out.println( openid );
         
		return result;

		
	}
}