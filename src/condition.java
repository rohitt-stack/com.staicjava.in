import java.util.Scanner;

public class condition {
    static void main() {
            Scanner Sc = new Scanner(System.in);
            int age = Sc.nextInt();

            if(age>=18){
                System.out.println("ADULT");
            }else{
                System.out.println("NOT_ADULT");
            }
        }
    }


