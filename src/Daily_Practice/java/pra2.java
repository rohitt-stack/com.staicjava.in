package Daily_Practice.java;

import java.util.Scanner;

public class pra2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            System.out.println("Enter a number");
            int n = in.nextInt();
            if (n>0) {
                System.out.println("Positive number");
            } else if ( n == 0) {
                System.out.println("Zero");
            } else{
                System.out.println("Negative number");
            }

        }

    }

