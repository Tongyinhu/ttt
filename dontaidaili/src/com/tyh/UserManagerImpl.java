package com.tyh;

public class UserManagerImpl implements UserManagerIface {

	@Override
	public void addUser(String username, String password) {
		// TODO Auto-generated method stub
		System.out.println("UserManagerImpl.addUser"+username+password);
	}

	@Override
	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		System.out.println("UserManagerImpl.deleteUser"+id);
	}

	@Override
	public void modifyUser(int id, String username, String password) {
		// TODO Auto-generated method stub
		System.out.println("UserManagerImpl.modifyUser"+username+password);
	}

	@Override
	public void findUserById(int id) {
		// TODO Auto-generated method stub
		System.out.println("UserManagerImpl.findUserById"+id);
	}
	
	/*
	 * ���磺
	 * ͨ�������ڵ���ĳ������֮ǰҪ����ȫ�Լ�飬
	 * ��ǰ��������Ҫ������д��ʵ�ֽӿڵ��Ǹ������ĳ���������еģ�
	 * ���ҵ�񷽷������ܾ���Ҫ�����䷳��д�ü��飬
	 * ������д�������������Ҫ�ڸ���ҵ�񷽷����������
	 * ����ʵ�ְ�ȫ�Լ�顣
	 * �����ʹ��������ǵķ�װ�ԡ�
	 */
    

}
