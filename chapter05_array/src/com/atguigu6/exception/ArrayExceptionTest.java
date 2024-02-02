package com.atguigu6.exception;
/**
 *
 * 测试数组中常见的异常
 *
 * @author 尚硅谷-宋红康
 * @create 13:22
 */
public class ArrayExceptionTest {
	public static void main(String[] args) {
		// 1. 数组角标越界的异常：
		int [] arr = new int[3];
		System.out.println(arr[5]);
		// 2. 空指针异常：
		// 情况一
		arr = null;
		System.out.println(arr[0]);
		// 情况二
		int[][] arr2 = new int[3][];
		System.out.println(arr2[0][1]);
		// 情况三
		String[] arr3 = new String[3];
		System.out.println(arr3[0].toString());
	}
}
