package Daily_Practice.java;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number ");
        int n = sc.nextInt();

        boolean isPrime= true;

        if(n <= 1) {
            isPrime = false;
        } else {
            for(int i = 2; i <= n/2; i++) {
                if(n % i == 0) {  // kisi se divide ho gaya
                    isPrime = false;
                    break;
                }
            }
        }

        if(isPrime) {
            System.out.println(n + " Prime hai");
        } else {
            System.out.println(n + "  Prime nahi hai");
        }

        sc.close();
    }
}


