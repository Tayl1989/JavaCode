package com.bjx.java;

public class ArrayTest2 {
	public static void main(String[] args) {
		String[] arr = new String[] {"JJ","DD","MM","BB","GG","AA"};
		
		//数组的复制
		String[] arr1 = new String[arr.length];
		for(int i = 0;i < arr1.length;i++)
		{
			arr1[i] = arr[i];
		}
		
		//数组的反转
//		for(int i = 0;i < arr1.length /2;i++)
//		{
//			String temp = arr[i];
//			arr[i] = arr[arr.length - i - 1];
//			arr[arr.length - i - 1] = temp;
//		}
		
		//遍历
		for(int i = 0;i < arr.length;i++)
		{
			System.out.println(arr[i] + "\t");
		}
		
		//查找
		//线性查找
		String dest = "BB";
		boolean isFlag = true;
		for(int i = 0;i < arr.length;i++)
		{
			if(dest.equals(arr[i]))
			{
				System.out.println("找到了指定的元素，位置为：" + i);
				break;
			}
		}
		System.out.println("没找到");
	}
}
