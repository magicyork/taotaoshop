package com.yaoyao.sso.service;

import com.yaoyao.common.pojo.ShopResult;
import com.yaoyao.pojo.TbUser;

public interface UserService {
	//用户验证
	ShopResult checkUserData(String data,int type);
	//注册  
	ShopResult register(TbUser tbUser);
	//登录  
	ShopResult login(String username,String password); 
	//通过token获取用户信息  
	ShopResult getUserByToken(String token);
	//安全退出  
	ShopResult logout(String token);
}
