package com.tyh.daili;

import com.tyh.UserManagerIface;
import com.tyh.UserManagerImpl;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * 创建一个目标对象
		 */
		UserManagerImpl uml = new UserManagerImpl();
		JDKProxy pro = new JDKProxy(uml);
		UserManagerIface umif = (UserManagerIface)pro.getProxyObject(); 
		
		umif.deleteUser(111);
	
	}

}
