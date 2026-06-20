package Arrays.java;
//
public class Array7 {
   /* public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,};
        int avg = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > avg) {
                avg = arr[i];
            }
        }
        System.out.println("The average is " + avg);
    }
}*/

   /* public static void main(String[] args) {
        int arr[] = {5, 10, 15, 20, 25};
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 10) {
                count++;
            }
        }
        System.out.println("" + count);
    }
}*/

    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10};

        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * arr[i];
        }
        System.out.println("The sum is: " + arr[i]);
    }
}
