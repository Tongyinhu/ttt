package com.tyh;
	
/**
 * 
 * 业务接口
 * @author Administrator
 *
 */
public interface UserManagerIface {
	
	public void addUser(String username,String password);
	
	public void deleteUser(int id);
	
	public void modifyUser(int id,String username,String password);
	
	public void findUserById(int id);
}
