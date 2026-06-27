package Oops_Concept.java;

interface SampleInterface{
    void method1();
    void method2();
}
interface ChildSampleInterface{
    void method3();
    void method4();
}
class MySampleclass implements ChildSampleInterface{
    public void method1(){
        System.out.println("method1");
    }
   public void method2(){
        System.out.println("method2");
    }
    public void method3(){
        System.out.println("method3");
    }
    public void method4(){
        System.out.println("method4");
    }
}

public class First7 {
    public static void main(String[] args) {
        MySampleclass obj = new MySampleclass();
        obj.method1();
        obj.method2();

    }
}
