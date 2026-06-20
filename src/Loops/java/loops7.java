package Loops.java;

import java.util.Scanner;

public class loops7 {
   /* public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            if(i%7==0){
                System.out.println(i);
            }
        }
    }
}*/

    /*public static void main(String[] args) {
        int cube = 0;
        for (int i = 1; i <= 10; i++) {
            cube = i * i * i;
            System.out.println(cube);
        }
    }
}*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        for (int i = n; i <= 10; i++) {
            System.out.println(n + "X" +i+ "=" +(i * n));
        }
    }
}

