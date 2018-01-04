<?php
/**
 * 抽象类
 * @author: 任广正
 * @date: 18-1-4
 */
abstract class Operation
{
	//抽象方法，子类必须实现
	abstract public function getValue($num1,$num2);
}