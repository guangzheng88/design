package com.rgz.client;

import com.rgz.api.Api;
import com.rgz.factory.Factory;

/**
 * 客户端，使用api接口
 * @author guangzheng
 * @date 2018-01-02 10:38:32
 */
public class Client {

	public static void main(String[] args) {
		// 通过简单工厂来获取接口对象
		Api api = Factory.createApi(1);
		api.operation("正在使用简单工厂");
	}

}
