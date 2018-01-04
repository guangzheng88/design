package com.rgz.impl;

import com.rgz.api.Api;
/**
 * 接口的具体实现A
 * @author guangzheng
 * @date 2018-01-02 10:29:55
 */
public class ImplA implements Api {

	@Override
	public void operation(String s) {
		System.out.println("ImplA s="+s);
	}

}
