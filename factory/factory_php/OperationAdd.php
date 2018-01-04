<?php
/**
 * 加法类
 * @author: 任广正
 * @date: 18-1-4
 */
require_once 'Operation.php';
class OperationAdd extends Operation
{
	public function getValue($num1, $num2)
	{
		// TODO: Implement getValue() method.
		return $num1 + $num2;
	}
}