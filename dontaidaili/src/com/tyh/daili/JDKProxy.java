package com.tyh.daili;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 负责产生代理对象，并且实现了InvocationHandler接口，它也是一个调用处理器
 * 
 * @author Administrator
 *
 */
public class JDKProxy implements InvocationHandler {

	/**
	 * 目标对象 或 者说 真实对象
	 */
	private Object targetObject;
	
	
	

	public JDKProxy(Object targetObject) {
		super();
		this.targetObject = targetObject;
	}

	/**
	 * 创建代理对象，
	 * 
	 * @return
	 */
	public Object getProxyObject() {
		return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(),

				targetObject.getClass().getInterfaces(),

				this);

	}

	/**
	 * 注意，这个方法，并不是我们主动去调用的
	 * 
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result = null;

		System.out.println("==============调用方法前================");

		result = method.invoke(targetObject, args);

		System.out.println("====================调用方法后======================");
		return result;
	}

}
