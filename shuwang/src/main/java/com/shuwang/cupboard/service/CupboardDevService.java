package com.shuwang.cupboard.service;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.gson.Gson;
import com.shuwang.cupboard.model.BusinessException;
import com.shuwang.cupboard.model.CupboardbaseDev;
import com.shuwang.cupboard.model.Exceptionresponse;
import com.shuwang.cupboard.model.QueryResponse;
import com.shuwang.cupboard.model.SendResult;
import com.shuwang.cupboard.model.Sendresponse;

public class CupboardDevService {
	protected final Logger log = LoggerFactory.getLogger(getClass());
	
	private String appid = null;
	private String appsecret = null;
	private String gatewayUrl = null;
	
	
	/**
	 * check whether initialized
	 * 
	 * @return boolean
	 */
	public boolean isInitialized() {
		return appid != null;
	}
	
	
	/**
	 * initial service
	 * 
	 * @param appid
	 *            应用编号
	 * @param appsecret
	 *            应用秘钥
	 * @param gatewayUrl
	 *            接口网关
	 */
	public void initial(String appid, String appsecret, String gatewayUrl) {
		this.appid = appid;
		this.appsecret = appsecret;
		this.gatewayUrl = gatewayUrl;
	}
	
	
	/**
	 * 查询设备状态
	 * @param devid
	 * @return
	 * @throws BusinessException 
	 */
	public CupboardbaseDev getcupboaer(Long devid,Integer num) throws BusinessException{
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("method", "cupboarddelivery.cupboard.text");
		params.put("appid", appid);
		params.put("timestamp", String.valueOf(System.currentTimeMillis()/1000));
		params.put("devid", String.valueOf(devid));
		params.put("num", num);	
	
		String signature = GatewayProtocolService
				.signRequest(params, appsecret);
		params.put("sign", signature);
		String result = GatewayProtocolService.callDirect(params, gatewayUrl);
		
		QueryResponse queryResponse=new Gson().fromJson(result, QueryResponse.class);
		log.debug("sendpay() result={}", result);
		
		if(queryResponse.getCode()!=200){
			Exceptionresponse exceptionresponse =new Gson().fromJson(result, Exceptionresponse.class);
			throw new BusinessException(new Gson().toJson(exceptionresponse.getResponse()));
		}

		return queryResponse.getResponse();
		
	}
	
	/**
	 * 发送开门状态
	 * @param devid
	 * @return
	 */
	public Sendresponse postcupboaer(Long userid, Long devid, int act,
			String callback, Integer num, int time, Integer volu){
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("method", "cupboarddelivery.cupboard");
		params.put("appid", appid);
		params.put("timestamp", String.valueOf(System.currentTimeMillis()/1000));
		params.put("userid", userid);
		params.put("devid", String.valueOf(devid));
		params.put("act", act);
		params.put("callback", callback);
		params.put("num", num);
		params.put("time", time);
		if(volu!=null){
			params.put("volu", volu);	
		}
		
		String signature = GatewayProtocolService
				.signRequest(params, appsecret);
		params.put("sign", signature);
		String result = GatewayProtocolService.callDirect(params, gatewayUrl);
		log.debug("sendpay() result={}", result);
		SendResult sendResult=new Gson().fromJson(result, SendResult.class);
		return sendResult.getResponse();
		
	}


}
