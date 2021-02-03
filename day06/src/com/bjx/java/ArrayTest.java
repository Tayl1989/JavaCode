package com.bjx.java;

public class ArrayTest {
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
//		一维数组的声明和初始化
		int num;//声明
		num = 10;//初始化
		int id = 1001;//声明+初始化
		
		int[] ids;//声明
		//静态初始化
		ids = new int[] {1001,1002,1003,1004};
		//动态初始化
		String[] names = new String[5];
		
		//调用数组指定位置的元素
		names[0] = "张三";
		names[1] = "李四";
		names[2] = "王五";
		names[3] = "孙六";
		names[4] = "黄七";
		
		//获取数组的长度
		System.out.println(names.length);
		System.out.println(ids.length);
		
		//遍历数组
		System.out.println(names[0]);
		System.out.println(names[1]);
		System.out.println(names[2]);
		System.out.println(names[3]);
		System.out.println(names[4]);
		
		for(int i = 0;i < names.length;i++)
		{
			System.out.println(names[i]);
		}
	}
}
