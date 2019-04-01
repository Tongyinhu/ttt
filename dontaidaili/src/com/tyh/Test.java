package com.tyh;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Test {
	
	/**
	 * Ŀ�����
	 */
	private Object targetObject ;
	
	
	private InvocationHandler  invocationHandler;
	
	
    /**
     * ͨ��������������Ŀ������ ���ô�����.
     * @param targetObject
     * @param invocationHandler
     */
	public Test(Object targetObject, InvocationHandler invocationHandler) {
		this.targetObject = targetObject;
		this.invocationHandler = invocationHandler;
	}

	/**
	 * 
	 * @return  ���� Ŀ������  �������
	 */
	public Object  getProxyObject(){
		return  Proxy.newProxyInstance(targetObject.getClass().getClassLoader(), 
				targetObject.getClass().getInterfaces(), invocationHandler);
		
	}
   

}
