package com.bjx.exer;

public class ArrayExer2 {
	public static void main(String[] args) {
		int[] array1,array2;
		
		array1 = new int[] {2,3,5,7,11,13,17,19};
		
		//显示array1的内容
		for(int i = 0;i < array1.length;i++)
		{
			System.out.println(array1[i] + "\t");
		}
		//数组的复制
		array2 = new int[array1.length];
		for(int i = 0;i < array2.length;i++)
		{
			array2[i] = array1[i];
		}
		
		for(int i = 0;i < array2.length;i++)
		{
			if(i % 2 == 0)
			{
				array2[i] = i;
			}
		}
		
		System.out.println();
		//打印出array1
		for(int i = 0;i < array1.length;i++)
		{
			System.out.println(array1[i] + "\t");
		}
	}
}
