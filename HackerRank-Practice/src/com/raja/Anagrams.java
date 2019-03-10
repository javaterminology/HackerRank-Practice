package com.raja;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	}

	private static boolean isAnagram(String a, String b) {
		
		String temp1 = a.replace(" ","").toLowerCase();
		String temp2 = b.replace(" ","").toLowerCase();
		char[] ca = temp1.toCharArray();
		char[] cb = temp2.toCharArray();
		Arrays.sort(ca);
		Arrays.sort(cb);
		if(Arrays.equals(ca, cb)){
			return true;
		}
		return false;
	}

}
