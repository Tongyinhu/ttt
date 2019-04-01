package com.tyh.daili;

import com.tyh.UserManagerIface;
import com.tyh.UserManagerImpl;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//构造一个目标对象
		
		UserManagerImpl   targetObject = new UserManagerImpl();
		
		JDKProxy   jdkProxy = new JDKProxy(targetObject);
		
		
		UserManagerIface   proxyObject = (UserManagerIface)jdkProxy.getProxyObject();
		
		
		proxyObject.deleteUser(111);

	}

}
