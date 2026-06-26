package Daily_Practice.java;

import java.util.Scanner;
// Reverse String.......
public class Sec5_Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter You String:");
        String str=sc.nextLine();
       // String tr ="Rohit";
        for(int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
    }
}
