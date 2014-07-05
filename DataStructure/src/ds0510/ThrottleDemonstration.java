/** 
 * Project Name:DataStructure 
 * File Name:ThrottleDemonstration.java 
 * Package Name:ds0510 
 * Date:2014年5月11日 下午9:29:08 
 * Copyright (c) 2014, zhangzhaoyu0524@163.com All Rights Reserved. 
 * 
*/  
  
package ds0510;  
/** 
 * ClassName:ThrottleDemonstration <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2014年5月11日 下午9:29:08 <br/> 
 * @author   zhangzhaoyu 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public class ThrottleDemonstration {

	public static void main(String[] args) {

		final int SIZE = 8;
		
		Throttle throttle = new Throttle(SIZE);
		throttle.shift(SIZE);
		
		while (throttle.isOn()) {
			System.out.printf("%5.3f\n", throttle.getFlow());
			throttle.shift(-1);
		}
	}

}
 