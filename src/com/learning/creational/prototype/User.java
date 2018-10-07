package com.learning.creational.prototype;

import java.util.ArrayList;
import java.util.List;

public class User {
	private List<String> userList;
	
	public User(){
		userList = new ArrayList<String>();
	}
	
	public User(List<String> list){
		this.userList = list;
	}
	
	public List<String> getUserList(){
		return userList;
	}
	
	public void loadUserList(){
		this.userList.add("Rajeev");
		this.userList.add("Raj");
		this.userList.add("David");
		this.userList.add("Lisa");
		this.userList.add("Pappu");
		
	}
	
	public Object clone() throws CloneNotSupportedException{
		List<String> newUserList = new ArrayList<String>();
		newUserList.addAll(userList);
		return new User(newUserList);
	}
}

class UserImpl{
	public static void main(String[] args) throws CloneNotSupportedException{
		User newUser = new User();
		newUser.loadUserList();
		newUser.getUserList().add("Sumit");
		System.out.println(newUser.getUserList());
		
		User newUserClone = (User) newUser.clone();
		newUserClone.getUserList().remove("Rajeev");
		System.out.println(newUser.getUserList());
		System.out.println(newUserClone.getUserList());
	}
}
