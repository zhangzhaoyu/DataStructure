/** 
 * Project Name:DataStructure 
 * File Name:Clock.java 
 * Package Name:ds0510 
 * Date:2014年5月11日 上午10:07:59 
 * Copyright (c) 2014, zhangzhaoyu0524@163.com All Rights Reserved. 
 * 
*/  
  
package ds0510;  
/** 
 * ClassName:Clock <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2014年5月11日 上午10:07:59 <br/> 
 * @author   zhangzhaoyu 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public class Clock {
	
	private int hour;
	private int minute;
	
	/**
	 * ture 上午
	 * false 下午
	 */
	private boolean flag;
	
	public Clock() {
		this.hour = 0;
		this.minute = 0;
		this.flag = false;
	}

	/**
	 * 
	 * initTime:<br />
	 * TODO
	 *
	 * @author zhangzhaoyu
	 * @param hour
	 * @param minute
	 * @param flag
	 * define the noon or afternoon
	 */
	public void initTime(int hour, int minute, boolean flag) {
		if (hour > 12 || hour < 0) {
			throw new IllegalArgumentException("bad hour : " + hour);
		}
		if (minute > 60 || minute < 0) {
			throw new IllegalArgumentException("bad minute : " + hour);
		}
		
		this.hour = hour;
		this.minute = minute;
		this.flag = flag;
	}
	
	/**
	 * 
	 * getHour:<br />
	 * TODO
	 *
	 * @author zhangzhaoyu
	 * @return
	 */
	public int getHour() {
		return this.hour;
	}
	
	/**
	 * 
	 * getMinute:<br />
	 * TODO
	 *
	 * @author zhangzhaoyu
	 * @return
	 */
	public int getMinute() {
		return this.minute;
	}
	
	/**
	 * 
	 * isNoon:<br />
	 * TODO
	 *
	 * @author zhangzhaoyu
	 * @return
	 */
	public boolean isNoon() {
		if (this.hour == 0 && this.minute == 0 && this.flag) {
			return true;
		} 
		else if (this.hour == 0 && this.minute == 0 && !this.flag) {
			return false;
		}
		return false;
	}
	
	/**
	 * 
	 * forwardMinute:<br />
	 * TODO
	 *
	 * @author zhangzhaoyu
	 * @param minute
	 */
	public void forwardMinute(int minute) {
		this.minute += minute;
		int times = this.minute / 60;
		int leftMinute = this.minute % 60;
		
		this.minute = leftMinute;
		this.hour += times;
	}
	
	@Override
	public String toString() {
		StringBuffer buffer = new StringBuffer();
		buffer.append(this.hour + ":" + this.minute);
		if (this.flag) {
			buffer.append(" A.M.");
		} else {
			buffer.append(" P.M.");
		}
		return buffer.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(new Clock().toString());
		
		Clock clock = new Clock();
		System.out.println(clock.hour);
	}
}
 