package com.raja;

import java.util.Scanner;

public class SubString {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		String s = in.next();
		int start = in.nextInt();
		int end = in.nextInt();
		in.close();
		
		System.out.println(s.substring(start, end));
		
		

	}

}
