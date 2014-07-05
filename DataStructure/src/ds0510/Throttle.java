/** 
 * Project Name:DataStructure 
 * File Name:Throttle.java 
 * Package Name:ds0510 
 * Date:2014年5月10日 下午12:54:35 
 * Copyright (c) 2014, zhangzhaoyu0524@163.com All Rights Reserved. 
 * 
*/  
  
package ds0510;  
/** 
 * ClassName:Throttle <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2014年5月10日 下午12:54:35 <br/> 
 * @author   zhangzhaoyu 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public class Throttle implements Cloneable {
	
	private int top;
	private int position;
	
	
	public Throttle() {
		top = 1;
		position = 0;
	}
	
	/**
	 * 
	 * Create a new instance of Throttle.
	 *
	 * @param size
	 */
	public Throttle(int size) {
		if (size <= 0) {
			throw new IllegalArgumentException("size <= 0 : " + size);
		}
		top = size;
		position = 0;
	}

	/**
	 * 
	 * getFlow:<br />
	 * return the rate of current flow and max flow 
	 *
	 * @author zhangzhaoyu
	 * @return
	 */
	public double getFlow() {
		return (double) position / (double) top;
	}
	
	/**
	 * 
	 * isOn:<br />
	 * judge if the throttle is open
	 *
	 * @author zhangzhaoyu
	 * @return
	 */
	public boolean isOn() {
		return (position > 0);
	}
	
	/**
	 * 
	 * shutOff:<br />
	 * shut off the throttle
	 *
	 * @author zhangzhaoyu
	 */
	public void shutOff() {
		position = 0;
	}
	
	/**
	 * 
	 * shift:<br />
	 * TODO
	 *
	 * @author zhangzhaoyu
	 * @param amount
	 */
	public void shift(int amount) {
		if (amount > top - position) {
			position = top;
		}
		else if (position + amount < 0) {
			position = 0;
		}
		else 
			position += amount;
	}
	
	/**
	 * 
	 * isAboveHalf:<br />
	 * TODO
	 *
	 * @author zhangzhaoyu
	 * @return
	 */
	public boolean isAboveHalf() {
		return (getFlow() > 0.5);
	}
	
	public Throttle clone() {
		Throttle throttle;
		try {
			throttle = (Throttle) super.clone();
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException("not supported ");
		}
		
		return throttle;
	}
}
 