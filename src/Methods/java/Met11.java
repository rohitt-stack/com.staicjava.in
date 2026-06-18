package Methods.java;

//import java.util.Scanner;

public class Met11 {
    /*static int cube(int a)
        {
        return a*a*a;
        }
      public static  void  main(String[] args){
        Scanner sc = new Scanner(System.in);
          System.out.println("Enter A Number:");
        int n = sc.nextInt();
        int cube = cube(n);
        //int a = 3;
          System.out.println(cube) ;
      }
}*/

/*static boolean iseven(int n) {
    if (n % 2 == 0) {
        return true;
    } else {
        return false;
    }
}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int n = sc.nextInt();
    String result = iseven(n)? "true":"false";
    System.out.println(result);
}*/

/*static int cube(int n) {
    return n * n * n * n * n * n;
}
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
    System.out.println("enter a number");
int a=sc.nextInt();
int reult = cube(a);
System.out.println(reult);

}*/

    static int min(int a, int b) {
        if (a < b) {

            return a;
        } else {
            return b;
        }
    }
        public static void main (String[]args){
            int result = min(10, 20);
            System.out.println(result);
        }
    }








