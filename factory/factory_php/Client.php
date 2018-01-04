<?php
/**
 * 客户端
 * @author: 任广正
 * @date: 18-1-4
 */
//通过简单工厂来创建对象
require_once 'Factory.php';
//调用加法类
$obj = Factory::createObj('+');
$num = $obj->getValue(12,21);
echo '12+21='.$num;
echo '<br>';
//调用减法类
$obj = Factory::createObj('-');
$num = $obj->getValue(20,12);
echo '20-12='.$num;