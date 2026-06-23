package Arrays.java;

public class Array8 {
   /* public static void main(String[] args) {
        int arr[]={10,20,30,40,50};
        int avg=arr[0];
        int sum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>avg){
                avg=arr[i];
            }
            sum+=arr[i];
        }
        avg=sum/arr.length;
        System.out.println("The average is "+avg);
        System.out.println("The sum is "+sum);
    }
}*/

   /* public static void main(String[] args) {
        int arr[] = {5, 10, 15, 20, 25};
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Minimum number is " + min);
    }
}*/

    public static void main(String[] args) {
        int arr[] = {2, 4, 6, 8, 10};
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 8) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    }
}
