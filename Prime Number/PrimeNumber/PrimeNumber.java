package PrimeNumber;

public class PrimeNumber {

    int i, j, count;

    void show(int x) {
        System.out.println("Prime numbers are: ");
        for (i = 2; i <= x; i++) {
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

}

public static void main(String[] args) {
    PrimeNumber P = new PrimeNumber();
    P.show(100);}
