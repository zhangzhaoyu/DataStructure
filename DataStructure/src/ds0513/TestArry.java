/** 
 * Project Name:DataStructure 
 * File Name:TestArry.java 
 * Package Name:ds0513 
 * Date:2014年5月13日 下午4:55:31 
 * Copyright (c) 2014, zhangzhaoyu0524@163.com All Rights Reserved. 
 * 
*/  
  
package ds0513;  
/** 
 * ClassName:TestArry <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2014年5月13日 下午4:55:31 <br/> 
 * @author   zhangzhaoyu 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public class TestArry {

	public static void main(String[] args) {

		int[] scores;
		int[] exams;
		
		scores = new int[3];
		scores[0] = 1;
		scores[1] = 2;
		scores[2] = 3;
		
		System.out.println(scores.toString());
		
		// the copy of array
		exams = scores.clone();
		System.out.println(exams.toString());
		
	}

	/**
	 * 
	 * sum:<br />
	 * TODO
	 *
	 * @author zhangzhaoyu
	 * @param data
	 * @return
	 */
	public static int sum(int[] data) {
		int sum = 0;
		for (int item : data) {
			sum += item;
		}
		return sum;
	}
	/**
	 * 
	 * initArray:<br />
	 * TODO
	 *
	 * @author zhangzhaoyu
	 * @return
	 */
	public int[] initArray() {
		/*final int SIZE = 1000;
		int[] arr = new int[SIZE];
		
		for (int i=0; i<SIZE; i++) {
			arr[i] = i+1;
		}
		return arr;*/
		final int SIZE = 1000;
		int[] arr = new int[SIZE];
		int i = 1;
		for (int item : arr) {
			item = (i++);
		}
		
		return arr;
	}
}
 