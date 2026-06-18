package Arrays.java;
//Array Ka last element ko print karo!
public class Array4 {
   /* public static void main(String[] args) {
        int arr[]= {10,20,30,40,50,};
        int lastindex=arr.length-1;
        System.out.println("Last Index: "+arr[lastindex]);
    }
}*/

    //Array pehla or last element ka sum print karo!
    public static void main(String[] args) {
        int arr[] = {5, 15, 25, 20, 10, 45};
        int firstindex = arr[0];
        int lastindex = arr[arr.length - 1];
        int sum = 0;
        sum = firstindex + lastindex;
        System.out.println("First and lastindex ka sum:\n" + sum);
    }
}


