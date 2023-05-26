//package com.check.alphabet;

import java.util.Scanner;

/**
 *
 * @author nishan
 */
public class ComCheckAlphabet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char ch;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any character: ");
        ch = scan.next().charAt(0);
        
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println("This is a character.");
        } 
        else if (ch >= '0' && ch <= '9');{
             System.out.println("This is a number.");
        }
       else{
        System.out.println("This a special character.");
       }
        
    }

}
