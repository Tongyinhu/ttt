package com.tyh;



public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * ��ʵ����
		 */
		UserManagerImpl user = new UserManagerImpl();
		
		Handle handle = new Handle(user);
		/**
		 * ΪUserManagerImpl���󣬲�����̬����
		 */		
		Test  test = new Test(user,handle);
		
		UserManagerIface   proxy = (UserManagerIface)test.getProxyObject();
		
		
		//proxy.deleteUser(123);
		
		proxy.addUser("aa", "dd");
	}
    
		
    
}
