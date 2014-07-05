/** 
 * Project Name:DataStructure 
 * File Name:PrintSqrt.java 
 * Package Name:ds0509 
 * Date:2014年5月9日 下午4:35:43 
 * Copyright (c) 2014, zhangzhaoyu0524@163.com All Rights Reserved. 
 * 
*/  
  
package ds0509;  
/** 
 * ClassName:PrintSqrt <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2014年5月9日 下午4:35:43 <br/> 
 * @author   zhangzhaoyu 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public class PrintSqrt {

	public static void printSqrt(double x) {
		if (x < 0) {
			throw new IllegalArgumentException("The Argument "+x+" can not be negative.");
		}
		System.out.println(x * x);
	}
	
	public static void main(String[] args) {
		printSqrt(1000);

		printSqrt(-2);
	}
	
	/**
	 * 
	 * prints:<br />
	 * TODO
	 *
	 * @author zhangzhaoyu
	 * @param age
	 * @param height
	 */
	public static void prints(int age, double height) {
		System.out.printf(
				"Age %10d Height %12.3f",
				age,
				height
				);
	}

	/**
	 * 
	 * search:<br />
	 * TODO
	 *
	 * @author zhangzhaoyu
	 * @param data
	 * @param target
	 * @return
	 */
	public static boolean search(double[] data, double target) {
		int i;
		for (i=0; i<data.length; i++) {
			if (data[i] == target) {
				return true;
			}
		} 

		return false;
	}
	
	public static int countArryTotal(int[] arr) {
		
		int length = arr.length;
		int sum = 0;
		
		if (length == 0) {
			return sum;
		} else {
			for (int i=0; i<length; i++) {
				sum += sum;
			}
		}
		return sum;
	}
	
	public static boolean contains(int[] a, int value) {
		int i;
		for (i=0; i<a.length; i++) {
			if (a[i] == value) {
				return true;
			}
		}
		return false;
	}
}
 