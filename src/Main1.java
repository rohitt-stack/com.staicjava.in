
import java.util.Scanner;
public class Main1 {
    static void main() {
        Scanner Sc = new Scanner(System.in);
        int x = Sc.nextInt();

        if(x % 2 == 0){
            System.out.println("even");
        }else{
            System.out.println("Odd");
        }
    }
}
