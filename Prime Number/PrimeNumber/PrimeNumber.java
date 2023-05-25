package PrimeNumber;

import java.util.Scanner;

public class PrimeNumber {
    
    int i, j, count;

    System.out.println("Enter upto which no. u want: ");
    Scanner scan = new Scanner(System.in);
    int range = scan.nextInt();
    System.out.println("Primen numbers are: ");
    for (i = 2; i <= range; i++) {
        count = 0;
        for (j = 2; j <= i; j++) {
            if (i % j == 0) {
                count++;
            }
        }
        if (count == 1) {
            System.out.print(i + " ");
        }
    }
}
