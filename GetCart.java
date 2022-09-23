package com.ty.controller;

import java.util.Scanner;

import com.ty.dao.CartDao;
import com.ty.dto.Cart;

public class GetCart {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id to fetch data");
		int id=sc.nextInt();
		CartDao cd=new CartDao();
		Cart c=cd.get(id);
		System.out.println(c.getId());
		System.out.println(c.getEmail());
		System.out.println(c.getPassword());
		System.out.println(c.getUsername());
		System.out.println(c.getAddress());
	}
}
