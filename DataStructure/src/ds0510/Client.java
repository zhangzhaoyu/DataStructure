/** 
 * Project Name:DataStructure 
 * File Name:Client.java 
 * Package Name:ds0510 
 * Date:2014年5月11日 上午11:29:04 
 * Copyright (c) 2014, zhangzhaoyu0524@163.com All Rights Reserved. 
 * 
*/  
  
package ds0510;  
/** 
 * ClassName:Client <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2014年5月11日 上午11:29:04 <br/> 
 * @author   zhangzhaoyu 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public class Client {

	public static void main(String[] args) {
		Clock clock = new Clock();
		clock.initTime(11, 34, false);
		System.out.println(clock);
		
		clock.forwardMinute(30);
		System.out.println(clock);
	}
}
 