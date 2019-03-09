package com.raja;

import java.util.Scanner;

public class Loops {

	private static final Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
        
        for(int i=1;i<=10;i++){
        	if(n>=2 && n<=20){
        		System.out.println(n+" x "+i+" = "+Math.multiplyExact(n, i));
        	}
        }

	}

}
