package com.tyh;
	
/**
 * 
 * ҵ��ӿ�
 * @author Administrator
 *
 */
public interface UserManagerIface {
	
	public void addUser(String username,String password);
	
	public void deleteUser(int id);
	
	public void modifyUser(int id,String username,String password);
	
	public void findUserById(int id);
}
