package Loops.java;
//1 se 10 tak numbers ka square print karo1
public class loops5 {
    /*public static void main(String[] args) {
        int num;
        for (int i=1; i<=10; i++) {
            num=i*i;
            System.out.print(num+" ");

        }
    }
}*/

  /* public static void main(String[] args) {

        for (int i = 10; i >= 1; i--) {

            System.out.println(i);
        }
    }
}*/


   public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 50; i++) {
            if (i % 2 != 0) {
                sum = sum + i;
            }
            System.out.println("sum = " + i);
        }
    }
}





