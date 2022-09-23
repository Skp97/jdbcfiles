package com.ty.controller;

import java.util.Scanner;

import com.ty.dao.CartDao;
import com.ty.dto.Cart;

public class InsertCart {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id");
		int id=sc.nextInt();
		System.out.println("Enter the email");
		String email=sc.next();
		System.out.println("Enter the password");
		String password=sc.next();
		System.out.println("Enter the username");
		String username=sc.next();
		System.out.println("Enter the address");
		String address=sc.next();
		Cart c=new Cart(id,email,password,username,address);
		CartDao cd=new CartDao();
		cd.insert(c);
	}
}
