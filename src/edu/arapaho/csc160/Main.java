package edu.arapaho.csc160;

// Ashton Cross
// CSC 160 680
// 2-9-2022

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a letter:");

        // take string as input; make string into character. Just take the first letter.
        String stringInput = input.next();
        char chrInput = stringInput.toCharArray()[0];

        // If it is a lowercase letter, make it capital so we don't get confused.
        if (chrInput > 96) {
            chrInput -= 32;
        }

        // there's probably a much better way to do this
        switch (chrInput) {
            case 65:
            case 66:
            case 67:
                System.out.println("The corresponding number is 2.");
                break;
            case 68:
            case 69:
            case 70:
                System.out.println("The corresponding number is 3");
            case 71:
            case 72:
            case 73:
                System.out.println("The corresponding number is 4");

        }

        System.out.println(chrInput);
    }
}