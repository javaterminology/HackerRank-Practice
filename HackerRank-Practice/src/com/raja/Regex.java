package com.raja;

import java.util.Scanner;

public class Regex {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()){
			String IP = in.next();
			System.out.println(IP.matches(new MyRegex().pattern));
		}
		in.close();
	}

}

class MyRegex{
	String ip = "([01]?\\d{1,2}|2[0-4]\\d|25[0-5])";
	String pattern = ip+"."+ip+"."+ip+"."+ip;
}
