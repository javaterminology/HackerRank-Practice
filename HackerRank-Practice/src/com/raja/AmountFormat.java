package com.raja;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class AmountFormat {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        NumberFormat usFormat = NumberFormat.getCurrencyInstance(new Locale("en","US"));
        String us = usFormat.format(payment);

        NumberFormat inFormat = NumberFormat.getCurrencyInstance(new Locale("en","IN"));
        String india = inFormat.format(payment);

        NumberFormat cnFormat = NumberFormat.getCurrencyInstance(new Locale("zh","CN"));
        String china = cnFormat.format(payment);

        NumberFormat frFormat = NumberFormat.getCurrencyInstance(new Locale("fr","FR"));
        String france = frFormat.format(payment);


        // Write your code here.

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}

