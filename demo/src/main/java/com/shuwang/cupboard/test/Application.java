package com.shuwang.cupboard.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;
import com.shuwang.cupboard.model.BusinessException;
import com.shuwang.cupboard.model.CupboardbaseDev;
import com.shuwang.cupboard.model.Sendresponse;
import com.shuwang.cupboard.service.CupboardDevService;
import com.shuwang.cupboard.test.config.CupboardConfig;

public class Application {
	protected static final Logger log = LoggerFactory
			.getLogger(Application.class);
    
	public static void main(String[] args) {
	  
//		cupboardevstatus();
//		
		cupboardevs();
//		cupboarvoice();
	}
    
	/**
	 * 发送货柜锁语音推送
	 */
	private static void cupboarvoice() {
		// TODO Auto-generated method stub
		Long devid =77779L;
		String voice="你好；欢迎光临";//推送的内容
		CupboardDevService cupboardDevService =new CupboardDevService();
		//配置参数
		cupboardDevService.initial(CupboardConfig.CLOUDAPP_APPID, CupboardConfig.CLOUDAPP_APPSECRET, CupboardConfig.GATEWAY_URL);

		Sendresponse result =cupboardDevService.postvoice(devid, voice);
		log.debug("result : {}", new Gson().toJson(result));		
	}

	/**
	 * s设备开关门接口
	 */
	private static void cupboardevs() {
		// TODO Auto-generated method stub
		Long devid =77779L;
		Long userid =10211L;
		int act =1;//1开门，2关门
		Integer num =1;//编号
		int time=10;//时间
		Integer volu=10;//音量
		String openvo="锁已打开，欢迎光临";//(选配) 开门语音播报
		String timevo="请开门";//(选配) 延时语音播报
		String clovo="感谢使用，欢迎下次光临";//(选配) 关门语音播报
		CupboardDevService cupboardDevService =new CupboardDevService();
		//配置参数
		cupboardDevService.initial(CupboardConfig.CLOUDAPP_APPID, CupboardConfig.CLOUDAPP_APPSECRET, CupboardConfig.GATEWAY_URL);
		String callback="www.baidu.com";
		Sendresponse result =cupboardDevService.postcupboaer(userid,devid, act,callback, num, time, volu,openvo,timevo,clovo);
		log.debug("result : {}", new Gson().toJson(result));	
	}

	/**
	 * 查询设备状态
	 */
	private static void cupboardevstatus() {
		// TODO Auto-generated method stub
		Long devid =77779L;
		Integer num =1;
		CupboardDevService cupboardDevService =new CupboardDevService();
		//配置参数
		cupboardDevService.initial(CupboardConfig.CLOUDAPP_APPID, CupboardConfig.CLOUDAPP_APPSECRET, CupboardConfig.GATEWAY_URL);
		
		CupboardbaseDev result = null;
		try {
			result = cupboardDevService.getcupboaer(devid,num);
		} catch (BusinessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		log.debug("cupboardbaseDev : {}", new Gson().toJson(result));
	}

}
