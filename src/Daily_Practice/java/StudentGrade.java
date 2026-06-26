package Daily_Practice.java;

import java.util.Scanner;

public class StudentGrade{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter student Name");
        String name = sc.nextLine();

        System.out.println("Enter Subject1 Marks");
        int s1 = sc.nextInt();

        System.out.println("Enter Subject2 Marks");
        int s2 = sc.nextInt();

        System.out.println("Enter Subject3 Marks");
        int s3 = sc.nextInt();

        System.out.println("Enter Subject4 Marks");
        int s4 = sc.nextInt();

        System.out.println("Enter Subject5 Marks");
        int s5 = sc.nextInt();

        if(      s1 <0|| s1>100||
                 s2 <0|| s2>100||
                 s3 <0|| s3>100||
                 s4 <0|| s4>100||
                 s5 <0|| s5>100){
            System.out.println("Error");
            return;
        }


        double Total = s1 + s2 + s3 + s4 + s5;
        double percentage = (Total/500)*100;




        //System.out.println("Enter Percentage");
        //double percentage = sc.nextDouble();

        String grade;

        if (percentage >= 90) {
            grade = "A+";
        } else if (percentage >= 75) {
            grade = "A";
        } else if (percentage>=60) {
            grade = "B";
        }else if (percentage >= 40) {
            grade = "C";
        }else {
            grade = "Fail";
        }

        System.out.println("\n_________RESULT__");
        System.out.println("Student Name: " + name);
        System.out.println("Subject: " + Total);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
    }
}
