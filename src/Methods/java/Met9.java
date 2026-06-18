package Methods.java;

import java.util.Scanner;

public class Met9 {
   /* static int square(int n)
    {
        return n*n;
    }
    public static void main(String[] args) {
       // int a=square(5);
        int a  =5;
        System.out.println(square(a));
    }
}*/

  static   int square(int n) {
      return (n * n);
  }
  public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number:");
  int n=sc.nextInt();
  int square=square(n);
  System.out.println(square);
  }
}



