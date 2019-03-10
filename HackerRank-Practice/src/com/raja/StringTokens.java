package com.raja;

import java.util.Scanner;

public class StringTokens {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
        String s = scan.nextLine();
        
        // Write your code here.
        scan.close();
        
        if(s.trim().length()>0){


        	String[] tokens =  s.trim().split("[ |!|,|\\?|\\.|_|'|@|]+");

        	int tokenCount = tokens.length;
        	System.out.println(tokenCount);
        	for(String token:tokens){
        		System.out.println(token);
        	}
        }else{
    		System.out.println(0);
    	}
	}

}
