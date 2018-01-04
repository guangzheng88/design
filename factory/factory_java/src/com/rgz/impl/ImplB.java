package com.rgz.impl;

import com.rgz.api.Api;
/**
 * 接口的具体实现B
 * @author guangzheng
 * @date 2018-01-02 10:30:11
 */
public class ImplB implements Api {

	@Override
	public void operation(String s) {
		System.out.println("ImplB s="+s);
	}

}
