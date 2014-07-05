/** 
 * Project Name:DataStructure 
 * File Name:Thermometer.java 
 * Package Name:ds0510 
 * Date:2014年5月11日 下午3:50:43 
 * Copyright (c) 2014, zhangzhaoyu0524@163.com All Rights Reserved. 
 * 
*/  
  
package ds0510;  
/** 
 * ClassName:Thermometer <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2014年5月11日 下午3:50:43 <br/> 
 * @author   zhangzhaoyu 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public class Thermometer {

	// (9.0/5.0) * c + 32
	
	/**
	 * 摄氏温度
	 */
	private double centigrade;
	
	public Thermometer() {
		this.centigrade = 0;
	}
	
	public void setCentigrade(double c) {
		this.centigrade += c;
	}
	
	public void setFahrenheit(double f) {
		this.centigrade += (f-32) / (9.0/5.0);
	}
	
	public double getCentigrade() {
		return this.centigrade;
	}
	
	public double getFahrenheit() {
		return (9.0/5.0) * this.centigrade + 32;
	}
	
	@Override
	public String toString() {
		return this.centigrade + " C";
	}
}
 