package Methods.java;

import java.util.Scanner;

public class Met5 {

    static String checkAge(int age) {

        if(age >= 18) {
            return "ADULT";
        } else {
            return "NOT_ADULT";
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Age:");
        int age = sc.nextInt();

        String result = checkAge(age);

        System.out.println(result);
    }
}
