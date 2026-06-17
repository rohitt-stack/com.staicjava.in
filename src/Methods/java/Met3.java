package Methods.java;

public class Met3 {
     static int logic(int x, int y) {
        int z =0;
        if(x>y){
            z=x+y;
        }
        else{
            z=(x+y)*5 ;
        }
        return z;
    }
    public static void main(String[] args) {

        int a=5;
        int b=7;
       // Met3 m=new Met3(); use for Object refrenc
        System.out.println(a+ " " +b);
        int c=logic(a,b);
        System.out.println(c);
    }
}
