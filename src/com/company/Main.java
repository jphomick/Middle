package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter a number with three middle digits:");
        int num = read.nextInt();
        String numS = String.valueOf(Math.abs(num));
        if (num % 2 == 0 || numS.length() < 3) {
            System.out.println("Error");
        } else {
            int len = numS.length();
            int mid = (len - 1) / 2;
            System.out.println(numS.charAt(mid - 1) + "" + numS.charAt(mid) + "" + numS.charAt(mid + 1));
        }
    }
}
