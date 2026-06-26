package Daily_Practice.java;
import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number dalo: ");
        int num = sc.nextInt();

        int original = num, reverse = 0, digit;

        while(num > 0) {
            digit = num % 10;
            reverse = reverse*10 + digit;  // उल्टा number बनाओ
            num = num / 10;
        }

        if(reverse == original) {
            System.out.println(original + " Palindrome hai");
        } else {
            System.out.println(original + " Palindrome nahi hai");
        }
        sc.close();
    }

}
