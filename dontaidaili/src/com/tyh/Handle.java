package com.tyh;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class Handle implements InvocationHandler{
	
	/**
	 * ´¦ÀíÆ÷
	 */
	
	private Object targetObject;
	
	
	public Handle(Object targetObject) {
		super();
		this.targetObject = targetObject;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		Object result = null;
		
		result = method.invoke(targetObject, args);
		
		return result;
	}
	
	
}
