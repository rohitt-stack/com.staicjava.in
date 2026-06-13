package Condition.java;
import java.util.Scanner;

public class con1 {
    static void main() {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter the age");
        int age = Sc.nextInt();

        if(age>=18){
            System.out.println("ADULT");
        }else{
            System.out.println("NOT_ADULT");
        }
    }
}


