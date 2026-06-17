package Condition.java;

import java.util.Scanner;
//user se
public class Con2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int a = sc.nextInt();
        //int a=10;
        if(a>=1){
            System.out.println("Positive");
        }
        else{
            System.out.println("Negative");
        }
    }
}
