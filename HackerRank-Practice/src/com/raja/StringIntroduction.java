package com.raja;

import java.util.Scanner;

public class StringIntroduction {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		sc.close();
		
		System.out.println(a.length()+b.length());
		if(a.compareTo(b)>0){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
		String tempA = a.substring(0,1).toUpperCase()+a.substring(1);
		String tempB = b.substring(0,1).toUpperCase()+b.substring(1);
		System.out.println(tempA+" "+tempB);
		
	}

}
