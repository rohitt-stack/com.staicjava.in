package Daily_Practice.java;

public class LargestOfThree {
    public static void main(String[] args) {
        int a = 4;
        int b = 3;
        int c = 9;
        if (a >= b && a >= c) {
            System.out.println(a + "Largest of three");
        } else if (b >= a && b >= c) {
            System.out.println(b + "Largest of three");
        } else {
            System.out.println(c + "Largest of three");
        }
    }
}
