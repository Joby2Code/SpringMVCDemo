package com.santosh.spring;

public class MyException extends RuntimeException {

	public  MyException(String s)
	{
		super(s);
		System.out.println("Exception is thrown");
	}
}
