package com.tyh.daili;

import com.tyh.UserManagerIface;
import com.tyh.UserManagerImpl;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//����һ��Ŀ�����
		
		UserManagerImpl   targetObject = new UserManagerImpl();
		
		JDKProxy   jdkProxy = new JDKProxy(targetObject);
		
		
		UserManagerIface   proxyObject = (UserManagerIface)jdkProxy.getProxyObject();
		
		
		proxyObject.deleteUser(111);

	}

}
