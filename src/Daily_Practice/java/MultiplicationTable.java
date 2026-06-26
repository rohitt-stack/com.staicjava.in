package Daily_Practice.java;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number ");
        int n = sc.nextInt();
        for (int i = n; i <= 10; i++) {
        System.out.println(n + "X" +i+ "=" +(i * n));
        }
    }
}
