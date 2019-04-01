package com.tyh.daili;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKProxy1 implements InvocationHandler{
	
	/**
	 * 目标对象  或  真实对象
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
	 * proxy 代理对象	method 接口的所有方法
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		Object result = null;
		System.out.println("============调用方法之前=============");
		result = method.invoke(targetObject, args);
		System.out.println("============调用方法之后=============");
		return result;
	}

	
}
