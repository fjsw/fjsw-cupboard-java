package com.shuwang.cupboard.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;
import com.shuwang.cupboard.service.CupboardDevService;
import com.shuwang.cupboard.test.config.CupboardConfig;
import com.shuwang.cupboard.test.model.CupboardbaseDev;

public class Application {
	protected static final Logger log = LoggerFactory
			.getLogger(Application.class);
    
	public static void main(String[] args) {
	  
		cupboardevstatus();
		
		cupboardevs();
	}
    
	/**
	 * s设备开关门接口
	 */
	private static void cupboardevs() {
		// TODO Auto-generated method stub
		Long devid =10211L;
		Long userid =10211L;
		int act =1;//1开门，2关门
		CupboardDevService cupboardDevService =new CupboardDevService();
		//配置参数
		cupboardDevService.initial(CupboardConfig.CLOUDAPP_APPID, CupboardConfig.CLOUDAPP_APPSECRET, CupboardConfig.CLOUDAPP_APPSECRET);
		
		boolean result =cupboardDevService.postcupboaer(userid, devid, act, null);
		log.debug("result : {}", result);	
	}

	/**
	 * 查询设备状态
	 */
	private static void cupboardevstatus() {
		// TODO Auto-generated method stub
		Long devid =10211L;
		CupboardDevService cupboardDevService =new CupboardDevService();
		//配置参数
		cupboardDevService.initial(CupboardConfig.CLOUDAPP_APPID, CupboardConfig.CLOUDAPP_APPSECRET, CupboardConfig.CLOUDAPP_APPSECRET);
		
		String result =cupboardDevService.getcupboaer(devid);
		log.debug("result : {}", result);
		CupboardbaseDev cupboardbaseDev =new Gson().fromJson(result, CupboardbaseDev.class);
		log.debug("cupboardbaseDev : {}", new Gson().toJson(cupboardbaseDev));
	}

}
