/** 
 * Project Name:DataStructure 
 * File Name:TestThrottle.java 
 * Package Name:ds0510 
 * Date:2014年5月11日 下午3:35:03 
 * Copyright (c) 2014, zhangzhaoyu0524@163.com All Rights Reserved. 
 * 
*/  
  
package ds0510;  

import static org.junit.Assert.*;

import org.junit.Test;

/** 
 * ClassName:TestThrottle <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2014年5月11日 下午3:35:03 <br/> 
 * @author   zhangzhaoyu 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public class TestThrottle {

	@Test
	public void test() {
		Throttle control;
		control = new Throttle(100);
		Throttle control1 = null;
		if (control1 == null) {
			System.out.println(true);
		}
		System.out.println(control);
	}
	
	@Test
	public void test1() {
		Thermometer thermometer = new Thermometer();
		thermometer.setCentigrade(10.0);
		System.out.println(thermometer);
	}

}
 