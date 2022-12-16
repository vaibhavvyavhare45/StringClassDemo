package com.warrior.string;

import java.util.*;
import java.io.*;
public class StringToken {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter the String: ");
		
		String s=sc.next().trim();
		sc.useDelimiter( "\\Z" );	
		if(s.length()>0) {
			String[] tokens=s.split("[!,?._'@\\S]+");
			System.out.println(tokens.length);
			for(String token:tokens) {
				System.out.println(token);
				System.out.println(s);
			}
		}
		else {
			System.out.println(0);
		}
		sc.close();
		
	}

}
