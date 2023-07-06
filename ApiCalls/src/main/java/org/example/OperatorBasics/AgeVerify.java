package org.example.OperatorBasics;

import java.util.Scanner;

public class AgeVerify {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give age: ");
        int age = scanner.nextInt();

        if(age >=13 && age<=19) {
            System.out.println("Teen");
        } else if (age < 13) {
            System.out.println("Kid");
        } else {
            System.out.println("Adult");
        }
    }
}