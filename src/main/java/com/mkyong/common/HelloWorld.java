package com.mkyong.common;

/**
 * Hello world!
 *
 */
public class HelloWorld 
{
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void printHello() {
		System.out.println("Hello ! " + name);
	}
	public static void main(String[]){
		System.out.println("Hello, World!");	
	}
}
