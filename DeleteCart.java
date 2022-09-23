package com.ty.controller;

import java.util.Scanner;

import com.ty.dao.CartDao;

public class DeleteCart {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the id to delete row");
		int id=sc.nextInt();
		CartDao cd=new CartDao();
		cd.delete(id);
	}
}
