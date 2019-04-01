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
	 * 例如：
	 * 通常我们在调用某个方法之前要做安全性检查，
	 * 以前，我们是要把它们写在实现接口的那个类里的某个方法当中的，
	 * 多个业务方法，可能就需要不厌其烦的写好几遍，
	 * 当我们写了这个方法后，需要在各个业务方法里调用它，
	 * 方能实现安全性检查。
	 * 这样就打破了我们的封装性。
	 */
    

}
