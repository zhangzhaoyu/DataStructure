/** 
 * Project Name:DataStructure 
 * File Name:UserDao.java 
 * Package Name:ds0513 
 * Date:2014年5月15日 下午11:19:29 
 * Copyright (c) 2014, zhangzhaoyu0524@163.com All Rights Reserved. 
 * 
*/  
  
package ds0513;  

import java.util.List;

/** 
 * ClassName:UserDao <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * Reason:   TODO ADD REASON. <br/> 
 * Date:     2014年5月15日 下午11:19:29 <br/> 
 * @author   zhangzhaoyu 
 * @version   
 * @since    JDK 1.7 
 * @see       
 */
public interface UserDao<User> extends BaseDao<User> {
	
	public List<User> queryUser(User user);
	
}
 