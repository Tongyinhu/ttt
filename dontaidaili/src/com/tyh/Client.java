package com.tyh;



public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * 真实对象
		 */
		UserManagerImpl user = new UserManagerImpl();
		
		Handle handle = new Handle(user);
		/**
		 * 为UserManagerImpl对象，产生动态代理
		 */		
		Test  test = new Test(user,handle);
		
		UserManagerIface   proxy = (UserManagerIface)test.getProxyObject();
		
		
		//proxy.deleteUser(123);
		
		proxy.addUser("aa", "dd");
	}
    
		
    
}
