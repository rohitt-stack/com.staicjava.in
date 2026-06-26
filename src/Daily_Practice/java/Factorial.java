package Daily_Practice.java;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println("Enter the number ");
           // for (int i = n; i <= 10; i++) {
                long fact = 1;
                for (int j = 1; j <= n; j++) {
                    fact = fact * j;
                }
                System.out.println(fact);
            }
        }


