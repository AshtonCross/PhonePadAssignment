
//////////////////////////////
// Ashton Cross
// CSC 160 - Computer Science I - Section 680
// February 14th, 2022
// Homework 4: checkpoint 4.15 from java book.
//////////////////////////////

package edu.arapahoe.csc160;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a letter:");

        // take string as input; make string into character. Just take the first letter.
        char chrInput = input.next().toCharArray()[0];

        // If it is a lowercase letter, make it capital to avoid dealing with lowercase AND uppercase.
        if (chrInput > 96) {
            chrInput -= 32;
        }

        int correspondingNumber = 2;

        for (int numberSection = 68; numberSection < 91; numberSection += 3) {
            if (chrInput < numberSection)  {
                break; // found it!
            }
            correspondingNumber++; // not here... next!
        }

        System.out.println("The corresponding number for " + chrInput + " is " + correspondingNumber);
    }
}