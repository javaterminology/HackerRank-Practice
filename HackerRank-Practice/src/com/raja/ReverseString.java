package com.raja;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		 	Scanner sc=new Scanner(System.in);
	        String s = sc.next();
	        String reverseStr = "";
	        sc.close();

	        /* Enter your code here. Print output to STDOUT. */
	        
	        for(int i=s.length()-1;i>=0;i--){
	        	if(i==s.length()){
	        		reverseStr += s.substring(i);
	        	}else{
	        		reverseStr += s.charAt(i);
	        	}
	        }
	        if(reverseStr.equals(s)){
	            System.out.println("Yes");
	        }else{
	            System.out.println("No");
	        }
	}

}
