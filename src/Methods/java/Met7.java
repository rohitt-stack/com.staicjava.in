package Methods.java;

import java.util.Scanner;

public class Met7 {

    static int calculate(int a, int b, char op) {

        if (op == '+') {
            return a + b;
        }
        else if (op == '-') {
            return a - b;
        }
        else if (op == '*') {
            return a * b;
        }
        else if (op == '/') {
            return a / b;
        }
        else {
            return 0;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number:");
        int num1 = sc.nextInt();

        System.out.println("Enter Second Number:");
        int num2 = sc.nextInt();

        System.out.println("Enter Operator (+, -, *, /):");
        char op = sc.next().charAt(0);

        int result = calculate(num1, num2, op);

        System.out.println("Result = " + result);
    }
}
