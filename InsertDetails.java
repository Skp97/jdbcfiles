package com.ty.controller;

import com.ty.dao.UserDao;
import com.ty.dto.UserDetails;

public class InsertDetails {
	public static void main(String[] args) {
		UserDao user=new UserDao();
		UserDetails userDetails=new UserDetails();
		userDetails.setFirstName("Sourav");
		userDetails.setLastName("Panda");
		userDetails.setEmail("skp@gmail.com");
		userDetails.setPassword("skp123");
		userDetails.setPhoneNum(8658159423l);
		userDetails.setDob("04-11-1997");
		userDetails.setGender("male");
		user.insert(userDetails);
		
	}
}
