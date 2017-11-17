package com.shuwang.cupboard.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;
import com.shuwang.cupboard.model.CupboardbaseDev;
import com.shuwang.cupboard.model.Sendresponse;
import com.shuwang.cupboard.service.CupboardDevService;
import com.shuwang.cupboard.test.config.CupboardConfig;

public class Application {
	protected static final Logger log = LoggerFactory
			.getLogger(Application.class);
    
	public static void main(String[] args) {
	  
		cupboardevstatus();
		
//		cupboardevs();
	}
    
	/**
	 * s设备开关门接口
	 */
	private static void cupboardevs() {
		// TODO Auto-generated method stub
		Long devid =10211L;
		Long userid =10211L;
		int act =1;//1开门，2关门
		Integer num =1;
		int time=10;
		Integer volu=5;
		CupboardDevService cupboardDevService =new CupboardDevService();
		//配置参数
		cupboardDevService.initial(CupboardConfig.CLOUDAPP_APPID, CupboardConfig.CLOUDAPP_APPSECRET, CupboardConfig.GATEWAY_URL);
		String callback="www.baidu.com";
		Sendresponse result =cupboardDevService.postcupboaer(userid,devid, act,callback, num, time, volu);
		log.debug("result : {}", new Gson().toJson(result));	
	}

	/**
	 * 查询设备状态
	 */
	private static void cupboardevstatus() {
		// TODO Auto-generated method stub
		Long devid =10211L;
		Integer num =1;
		CupboardDevService cupboardDevService =new CupboardDevService();
		//配置参数
		cupboardDevService.initial(CupboardConfig.CLOUDAPP_APPID, CupboardConfig.CLOUDAPP_APPSECRET, CupboardConfig.GATEWAY_URL);
		
		CupboardbaseDev result =cupboardDevService.getcupboaer(devid,num);
		log.debug("cupboardbaseDev : {}", new Gson().toJson(result));
	}

}
