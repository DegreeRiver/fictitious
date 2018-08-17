package com.fictitious.inherit.api.response;

import java.io.Serializable;

/**
 * 
 * 基础响应接口
 * @Author dubaolong
 * @Create In 2018年3月23日
 */
public class BaseResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7234181228601967742L;
	/**
	 * 是否成功
	 */
	private boolean success;
	/**
	 * 响应码
	 */
	private String responseCode;
	/**
	 * 响应信息
	 */
	private String responseMessage;
	
	public BaseResponse() {
		super();
	}
	
	public BaseResponse(boolean success, String responseCode, String responseMessage) {
		super();
		this.success = success;
		this.responseCode = responseCode;
		this.responseMessage = responseMessage;
	}
	
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public String getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}
	public String getResponseMessage() {
		return responseMessage;
	}
	public void setResponseMessage(String responseMessage) {
		this.responseMessage = responseMessage;
	}

	public void setCodeWithMsg(String responseCode,String responseMessage){
		setResponseCode(responseCode);
		setResponseMessage(responseMessage);
	}
}
