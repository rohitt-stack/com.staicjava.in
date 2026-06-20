package Condition.java;

import java.util.Scanner;

public class Con5 {
    // Ek number lo aur check karo ki wo 3 se divisible hai ya nahi

   /* public static void main(String[] args) {
        int a = 15;
        if (a%3==0)
        {
            System.out.println( "3 se divisibale hai" +a);
        } else {
            System.out.println( "3 se divisibale nhai hai" +a);
        }
    }
}*/
/*public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
    System.out.println("enter a number");
int n=sc.nextInt();

if (n%3==0){
    System.out.println("3&5 se divide by zero" +n);
}else {
    System.out.println("3&5 se divide by one" +n);
}
}
}*/

//. Ek number lo aur check karo ki wo positive, negative ya zero hai.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        if (n >= 1) {
            System.out.println(n + " is a Positive");
        } else {
            System.out.println(n + " is a Negative");
        }
    }
}

//. Teen numbers lo aur sabse bada number print karo.
/*public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a Three Number");
    int a;
    a=sc.nextInt();
    int b;
    b=sc.nextInt();
    int c;
    c=sc.nextInt();
    if(a>b && a>c){
        System.out.println("Bada number" +a);
    }else if(b>a && b>c){
        System.out.println("Bada number" +b);
    }
    else if(c>a&&c>b){
        System.out.println("Bada number" +c);
    }

    }

}*/