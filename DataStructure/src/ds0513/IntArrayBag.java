/** 
 * Project Name:DataStructure 
 * File Name:IntArrayBag.java 
 * Package Name:ds0513 
 * Date:2014年5月13日 下午5:11:39 
 * Copyright (c) 2014, zhangzhaoyu0524@163.com All Rights Reserved. 
 * 
*/  
  
package ds0513;  
/** 
 * ClassName:IntArrayBag <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2014年5月13日 下午5:11:39 <br/> 
 * @author   zhangzhaoyu 
 * @version  1.0
 * @since    JDK 1.7 
 * @see      1.0
 */
public class IntArrayBag implements Cloneable {
	
	private int[] data;
	private int manyItems;
	
	public IntArrayBag() {
		this.data = new int[10];
	}
	
	public IntArrayBag(int initalCapacity) {
		if (initalCapacity < 0) {
			throw new IllegalArgumentException("initalCapacity is negative " + initalCapacity);
		}
		this.manyItems = 0;
		this.data = new int[initalCapacity];
	}
	
	public void add(int element) {
		if (this.manyItems == this.data.length) {
			ensureCapacity(manyItems * 2 + 1);
		}
		
		data[manyItems] = element;
		manyItems ++;
	}
	
	public void addMany(int ... elements) {
		if (this.manyItems + elements.length > this.data.length) {
			ensureCapacity((this.manyItems + elements.length) * 2 + 1);
		}
		System.arraycopy(elements, 0, this.data, this.manyItems, elements.length);
		manyItems += elements.length;
	}

	public void addAll(IntArrayBag arrayBag) {
		ensureCapacity(this.manyItems + arrayBag.manyItems);
		System.arraycopy(arrayBag, 0, this.data, this.manyItems, arrayBag.manyItems);
		manyItems += arrayBag.manyItems;
	}
	
	public boolean remove(int target) {
		int index = 0;
		
		while ((index < manyItems) && (target != this.data[index])) {
			index++;
		}
		if (index == this.manyItems) {
			return false;
		} else  {
			manyItems--;
			data[index] = data[this.manyItems];
			return true;
		}
	}
	
	public int removeAll(int target) {
		int i=0;
		int count = 0;
		while (i < this.manyItems) {
			if (this.data[i] == target) {
				this.manyItems--;
				this.data[i] = this.data[this.manyItems];
				count ++;
			} else {
				i ++;
			}
		}
		return count;
	}
	
	public int removeMany(int ... elements) {
		int count = 0;
		
		for (int item : elements) {
			if (remove(item)) {
				count ++;
			}
		}
		return count;
	}
	
	public int size() {
		return this.manyItems;
	}
	
	public int countOccurrences(int target) {
		int answer = 0;
		
		for (int i=0; i<this.manyItems; i++) {
			if (target == data[i]) {
				answer ++;
			}
		}
		return answer;
	}
	
	public static IntArrayBag union(IntArrayBag b1, IntArrayBag b2) {
		IntArrayBag answer = new IntArrayBag(b1.getCapacity() + b2.getCapacity());
		System.arraycopy(b1.data, 0, answer.data, 0, b1.manyItems);
		System.arraycopy(b2.data, 0, answer.data, b1.manyItems, b2.manyItems);
		return answer;
	}
	
	public static IntArrayBag intersection(IntArrayBag b1, IntArrayBag b2) {
		int i, j;
		int count = 0;
		int it;
		IntArrayBag a = new IntArrayBag();
		
		for (i=0; i<b1.manyItems; i++) {
			it = b1.data[i];
			if (a.countOccurrences(it) == 0) {
				count = Math.min(b1.countOccurrences(it), b2.countOccurrences(it));
			}
			
			for (j=0; j<count; j++) {
				a.add(it);
			}
		}
		return a;
	}
	
	public IntArrayBag clone() {
		IntArrayBag answer;
		try {
			// 仅仅是浅拷贝 不能拷贝对象内部的引用对象
			answer = (IntArrayBag) super.clone();
			answer.data = this.data.clone();
		} catch (CloneNotSupportedException e) {
			throw new RuntimeException("This class does not implement Clonable.");
		}
		return answer;
	}
	
	public int getCapacity() {
		return this.data.length;
	}
	
	public void ensureCapacity(int mininumCapacity) {
		int[] biggerArry;
		if (this.data.length < mininumCapacity) {
			biggerArry = new int[mininumCapacity];
			System.arraycopy(this.data, 0, biggerArry, 0, this.manyItems);
			this.data = biggerArry;
		}
	}
	
	public void trimToSize() {
		int [] trimedArray;
		
		if (data.length != this.manyItems) {
			trimedArray = new int[this.manyItems];
			System.arraycopy(this.data, 0, trimedArray, 0, this.manyItems);
			this.data = trimedArray;
		}
	}
}
 