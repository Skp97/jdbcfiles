package com.ty.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import com.ty.dao.UserDao;
import com.ty.dto.UserDetails;

public class FetchDetails {
	public static void main(String[] args) {
		UserDao user=new UserDao();
		UserDetails userDetails=new UserDetails();
		userDetails.setEmail("pskp@gmail.com");
		userDetails.setPassword("anuj123");
		UserDetails u=user.getUserByEmailAndPassword(userDetails.getEmail(), userDetails.getPassword());
		System.out.println(u.getFirstName());
		System.out.println(u.getLastName());
		System.out.println(u.getEmail());
		System.out.println(u.getPassword());
		System.out.println(u.getPhoneNum());
		System.out.println(u.getDob());
		System.out.println(u.getGender());
		if(u!=null) 
			System.out.println("Signup is successfull");
			else
				System.out.println("Please try again");
		
		
	}
}

