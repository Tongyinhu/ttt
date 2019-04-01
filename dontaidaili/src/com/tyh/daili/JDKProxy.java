package com.tyh.daili;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * �������������󣬲���ʵ����InvocationHandler�ӿڣ���Ҳ��һ�����ô�����
 * 
 * @author Administrator
 *
 */
public class JDKProxy implements InvocationHandler {

	/**
	 * Ŀ����� �� ��˵ ��ʵ����
	 */
	private Object targetObject;
	
	
	

	public JDKProxy(Object targetObject) {
		super();
		this.targetObject = targetObject;
	}

	/**
	 * �����������
	 * 
	 * @return
	 */
	public Object getProxyObject() {
		return Proxy.newProxyInstance(targetObject.getClass().getClassLoader(),

				targetObject.getClass().getInterfaces(),

				this);

	}

	/**
	 * ע�⣬�����������������������ȥ���õ�
	 * 
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		Object result = null;

		System.out.println("==============���÷���ǰ================");

		result = method.invoke(targetObject, args);

		System.out.println("====================���÷�����======================");
		return result;
	}

}
