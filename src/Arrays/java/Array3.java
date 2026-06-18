package Arrays.java;

public class Array3 {
    public static void main(String[] args) {
        int arr[]= {5,10,15,20,25};
        int avg=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>avg){
                avg=arr[i];
            }
        }
        System.out.println(avg);

    }
}
