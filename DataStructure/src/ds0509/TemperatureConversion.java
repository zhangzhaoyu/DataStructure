/** 
 * Project Name:DataStructure 
 * File Name:TemperatureConversion.java 
 * Package Name:ds0509 
 * Date:2014年5月9日 下午4:16:35 
 * Copyright (c) 2014, zhangzhaoyu0524@163.com All Rights Reserved. 
 * 
*/  
  
package ds0509;  
/** 
 * ClassName:TemperatureConversion <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2014年5月9日 下午4:16:35 <br/> 
 * @author   zhangzhaoyu 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public class TemperatureConversion {

	public static void main(String[] args) {

		final double TABLE_BEGIN = -50.0;
		final double TABLE_END = 50;
		final double TABLE_STEP = 10.0;
		
		double celsius;
		double fahrenheit;
		
		for (celsius=TABLE_BEGIN; celsius < TABLE_END; celsius+=TABLE_STEP) {
			fahrenheit = celsiusToFahrenheit(celsius);
			System.out.printf("%6.2fC", celsius);
			System.out.printf("%14.2fF\n", fahrenheit);
		}
		celsiusToFahrenheit(-345);
	}

	/**
	 * 
	 * celsiusToFahrenheit:<br />
	 * TODO
	 *
	 * @author zhangzhaoyu
	 * @param celsius
	 * @return
	 */
	public static double celsiusToFahrenheit(double celsius) {
		final double MINMUN_CELSIUS = -273.15;
		if (celsius < MINMUN_CELSIUS) {
			throw new IllegalArgumentException("Argument " + celsius + " is too small.");
		}
		return (9.0/5.0) * celsius + 32;
	}
}
 