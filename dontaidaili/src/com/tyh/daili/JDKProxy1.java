package com.tyh.daili;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKProxy1 implements InvocationHandler{
	
	/**
	 * Ŀ�����  ��  ��ʵ����
	 */
	private Object targetObject;
	
	public JDKProxy1(Object targetObject) {
		super();
		this.targetObject = targetObject;
	}

	public Object getProxyObject(){
		return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(),
				targetObject.getClass().getInterfaces(), this);
		
	}
	
	/**
	 * proxy �������	method �ӿڵ����з���
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		Object result = null;
		System.out.println("============���÷���֮ǰ=============");
		result = method.invoke(targetObject, args);
		System.out.println("============���÷���֮��=============");
		return result;
	}

	
}
