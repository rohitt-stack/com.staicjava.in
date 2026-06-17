package Methods.java;



import java.util.Scanner;

public class Met6 {

    static String checkResult(int marks) {

        if(marks >= 33) {
            return "PASS";
        } else {
            return "Sorry! Fail";
        }

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Marks:");
        int marks = sc.nextInt();

        String result = checkResult(marks);

        System.out.println(result);
    }
}

