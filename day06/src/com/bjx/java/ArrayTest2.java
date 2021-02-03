package com.bjx.java;

public class ArrayTest2 {
	public static void main(String[] args)
	{
		//二维数组的声明和初始化
		int[] arr = new int[] {1,2,3};//一维数组
		//静态初始化
		int[][] arr1 = new int[][] {{1,2,3},{4,5},{6,7,8}};
		//动态初始化1
		String[][] arr2 = new String[3][2];
		//动态初始化2
		String[][] arr3 = new String[3][];
	
		int[] arr4[] = new int[][] {{1,2,3},{4,5},{6,7,8}};
		int[] arr5[] = {{1,2,3},{4,5},{6,7,8}};
	
		//调用数组指定位置的元素
		System.out.println(arr1[0][1]);
		System.out.println(arr2[1][1]);
	
		arr3[1] = new String[4];
		System.out.println(arr3[1][0]);
		
		//获取数组的长度
		System.out.println(arr4.length);
		System.out.println(arr4[0].length);
		System.out.println(arr4[1].length);
		
		//遍历二维数组
		for(int i = 0;i < arr4.length;i++)
		{
			for(int j = 0;j < arr4[i].length;j++)
			{
				System.out.println(arr4[i][j] + " ");
			}
		}
	}

}
