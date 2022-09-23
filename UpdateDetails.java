package com.ty.controller;

import com.ty.dao.UserDao;
import com.ty.dto.UserDetails;

public class Update {
	public static void main(String[] args) {
		UserDao user=new UserDao();
		UserDetails userDetails=new UserDetails();
		userDetails.setFirstName("Anuj");
		userDetails.setLastName("Kumar");
		userDetails.setEmail("skp@gmail.com");
		userDetails.setPassword("anuj123");
		userDetails.setPhoneNum(8658159424l);
		userDetails.setDob("04-11-1998");
		userDetails.setGender("male");
		user.update(userDetails);
		
	}
}
