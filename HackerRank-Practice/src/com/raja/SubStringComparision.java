package com.raja;

import java.util.*;

public class SubStringComparision {

	public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        SortedSet<String> sortedSet = new TreeSet<String>();
        
        for(int i=0;i<=s.length()-k;i++){
        	if(i==0){
        		System.out.println("-"+s.substring(i, k));
        		sortedSet.add(s.substring(i, k));
        	}else{
        		System.out.println("--"+s.substring(i, i+k));
        		sortedSet.add(s.substring(i, i+k));
        	}
        	
        }
        
        smallest =  sortedSet.first();
        largest = sortedSet.last();
        
        return smallest + "\n" + largest;
    }
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	        String s = scan.next();
	        int k = scan.nextInt();
	        scan.close();
	      
	        System.out.println(getSmallestAndLargest(s, k));
	}

}
