package Daily_Practice.java;
import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Number dalo: ");
        int num = sc.nextInt();

        int original = num, sum = 0, digit;

        while(num > 0) {
            digit = num % 10;        // last digit लो
            sum = sum + digit*digit*digit;  // cube करके जोड़ो
            num = num / 10;          // last digit हटाओ
        }

        if(sum == original) {
            System.out.println(original + " Armstrong hai");
        } else {
            System.out.println(original + " Armstrong nahi hai");
        }
        sc.close();
    }
}

