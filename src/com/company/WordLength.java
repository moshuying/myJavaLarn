package com.company;

import java.util.Scanner;

public class WordLength {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String temp = input.next();
        char ch = '.';
        while (temp.length() > 0) {
            if (temp.charAt(temp.length() - 1) == ch) {
                System.out.print((temp.substring(0, temp.length() - 1)).length());
                break;
            } else {
                System.out.print(temp.length() + " ");
                temp = input.next();
            }
        }
    }
}
