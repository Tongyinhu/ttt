package com.tyh;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Test {
	
	/**
	 * 目标对象
	 */
	private Object targetObject ;
	
	
	private InvocationHandler  invocationHandler;
	
	
    /**
     * 通过构造器，传入目标对象和 调用处理器.
     * @param targetObject
     * @param invocationHandler
     */
	public Test(Object targetObject, InvocationHandler invocationHandler) {
		this.targetObject = targetObject;
		this.invocationHandler = invocationHandler;
	}

	/**
	 * 
	 * @return  返回 目标对象的  代理对象
	 */
	public Object  getProxyObject(){
		return  Proxy.newProxyInstance(targetObject.getClass().getClassLoader(), 
				targetObject.getClass().getInterfaces(), invocationHandler);
		
	}
   

}
