package com.fictitious.inherit.api.request;



import java.io.Serializable;

/**
 * 基础请求接口
 * @Author dubaolong
 * @Create In 2018年3月23日
 */
@Data
public class BaseRequest implements Serializable {

	private static final long serialVersionUID = -7234181228601967742L;

	/**
	 * 系统调用者
	 */
	private String caller;
	/**
	 * 账号
	 */
	private String account;
	/**
	 * 登录密码
	 */
	private String password;
	/**
	 * 调用方 signature 验证信息（其他系统调用时传递，用于验证客服代操作等行为）
	 */
	private String signature;
	/**
	 * 客户端调用ip地址，获取不到的话，请传服务器的IP地址
	 */
	private String ip;
	/**
	 * pin
	 */
	private String pin;


}
