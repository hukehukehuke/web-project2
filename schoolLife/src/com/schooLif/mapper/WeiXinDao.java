package com.schooLif.mapper;

import com.schoolLife.pojo.WeiXin;

public interface WeiXinDao {
	//添加保存
   public void addWeiXin(WeiXin weiXin);
   //查询
   public WeiXin chakanWeixin(String openid);
   //修改
   public WeiXin xiugaiWEixin(WeiXin weiXin);
}
