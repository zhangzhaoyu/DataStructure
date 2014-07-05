/** 
 * Project Name:DataStructure 
 * File Name:BaseDao.java 
 * Package Name:ds0513 
 * Date:2014年5月15日 下午11:18:06 
 * Copyright (c) 2014, zhangzhaoyu0524@163.com All Rights Reserved. 
 * 
*/  
  
package ds0513;  
/** 
 * ClassName:BaseDao <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2014年5月15日 下午11:18:06 <br/> 
 * @author   zhangzhaoyu 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public interface BaseDao<T> {

	public void delete(T t);
	
	public void update(T t);
	
	public void add(T t);
}
 