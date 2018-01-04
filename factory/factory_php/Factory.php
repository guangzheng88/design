<?php
/**
 * 简单工厂类,主要用来创建对象,选择实现
 * @author: 任广正
 * @date: 18-1-4
 */
require_once 'OperationAdd.php';
require_once 'OperationSub.php';
class Factory
{
	public static function createObj($operate)
	{
		switch ($operate)
		{
			case '+':
				return new OperationAdd();
				break;
			case '-':
				return new OperationSub();
				break;
			default:
				exit('error');
		}
	}
}
