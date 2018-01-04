package com.rgz.api;

/**
 * 某个接口（通用的、抽象的、非具体的功能）
 * @author guangzheng
 * @date 2018-01-02 09:56:59
 */
public interface Api {
	/**
	 * 某个具体的方法的功能的定义.用test1来演示一下
	 * 这里的功能很简单，把传入的s打印输出即可
	 * @param s 任意想要打印输出的字符串
	 */
	public void operation(String s);
}
