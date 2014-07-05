/** 
 * Project Name:DataStructure 
 * File Name:IntNode.java 
 * Package Name:ds0701 
 * Date:2014年7月1日 下午3:38:33 
 * Copyright (c) 2014, zhangzhaoyu0524@163.com All Rights Reserved. 
 * 
*/  
  
package ds0701;  

import java.util.Iterator;

/** 
 * ClassName:IntNode <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2014年7月1日 下午3:38:33 <br/> 
 * @author   zhangzhaoyu 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public class IntNode implements Iterator<Integer>{

	private int data;
	private IntNode link;
	
	public IntNode(int initData, IntNode initialLink) {
		this.data = initData;
		this.link = initialLink;
	}
	
	public int getData() {
		return this.data;
	}
	
	public void setData(int data) {
		this.data = data;
	}
	
	public void setLink(IntNode newLink) {
		this.link = newLink;
	}
	
	@Override
	public boolean hasNext() {
		return false;
	}

	@Override
	public Integer next() {
		return null;
	}

	@Override
	public void remove() {
		
	}
	
	public static void main(String[] args) {
		IntNode head = new IntNode(42, null);
		head = new IntNode(12, head);
		
		while (head != null) {
			System.out.println(head.getData());
			head = head.link;
		}
	}
	
}
 