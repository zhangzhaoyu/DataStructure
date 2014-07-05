/** 
 * Project Name:DataStructure 
 * File Name:Location.java 
 * Package Name:ds0511 
 * Date:2014年5月11日 下午10:01:45 
 * Copyright (c) 2014, zhangzhaoyu0524@163.com All Rights Reserved. 
 * 
*/  
  
package ds0511;  
/** 
 * ClassName:Location <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2014年5月11日 下午10:01:45 <br/> 
 * @author   zhangzhaoyu 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public class Location implements Cloneable {

	private double x;
	private double y;
	
	public Location(double xInitial, double yInitial) {
		this.x = xInitial;
		this.y = yInitial;
	}
	
	public Location clone() {
		Location answer;
		try {
			answer = (Location) super.clone();
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException("this class does not implement Cloneable.");
		}
		return answer;
	}
	
	
	public static double distance(Location p1, Location p2) {
		double a, b, c_squared;
		
		if (p1 == null || p1 == null) {
			return Double.NaN;
		}
		
		a = p1.x - p2.x;
		b = p1.y - p2.y;
		
		c_squared = a*a + b*b;
		return Math.sqrt(c_squared);
	}
	
	public static Location midpoint(Location p1, Location p2) {
		double xMid, yMid;
		
		if (p1 == null || p2 == null) {
			return null;
		}
		
		xMid = (p1.x/2) + (p2.x/2);
		yMid = (p1.y/2) + (p2.y/2);
		
		return new Location(xMid, yMid);
	}
	
	public static void specifiedRotacion(Location location, int n) {
		while (n > 0) {
			//location.rotate90();
			n--;
		}
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof Location) {
			Location candidate = (Location) obj;
			return (candidate.x == this.x) && (candidate.y == this.y);
		}
		return false;
	}
	
	
}
 