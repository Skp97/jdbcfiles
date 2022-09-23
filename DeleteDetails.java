package com.ty.controller;

import java.util.Scanner;

import com.ty.dao.UserDao;
import com.ty.dto.UserDetails;

public class Delete {
	public static void main(String[] args) {
		UserDao user=new UserDao();
		UserDetails userDetails=new UserDetails();
		userDetails.setEmail("skp@gmail.com");
		userDetails.setPassword("anuj123");
		user.delete(userDetails.getEmail(), userDetails.getPassword());
	}
}
