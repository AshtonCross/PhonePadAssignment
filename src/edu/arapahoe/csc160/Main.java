
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
        char charInput = input.next().toCharArray()[0];

        // If it is a lowercase letter, make it capital to avoid dealing with lowercase AND uppercase.
        if (charInput > 96) {
            charInput -= 32;
        }

        int correspondingNumber = 2;

        // a - o:
        if (charInput < 'P') {
            for (int numberSection = 'D'; numberSection < 'P'; numberSection += 3) {
                if (charInput < numberSection)  {
                    break; // found it!
                }
                correspondingNumber++; // not here... next!
            }
        }
        // p - z:
        else {
            // these letters are a little more clunky, and so will be handled manually (7 has 4 letters instead of 3, 8 has 3, and 9 has 3.)
            if (charInput < 'T') {
                // p q r s
                correspondingNumber = 7;
            }
            else if (charInput < 'W') {
                // t u v
                correspondingNumber = 8;
            }
            else {
                // w x y z
                correspondingNumber = 9;
            }
        }

        System.out.println("The corresponding number for " + charInput + " is " + correspondingNumber);
    }
}
