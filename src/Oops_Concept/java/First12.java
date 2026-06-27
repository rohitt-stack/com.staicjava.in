package Oops_Concept.java;
abstract class telPhone{
    abstract void ring();
    abstract void lift();
    abstract void disConnect();
}
class SmartTelPhone extends telPhone{
    @Override
    void ring() {
        System.out.println("Telephone is Ringing...");
    }
    @Override
    void lift() {
        System.out.println("Call pick up....");
    }
    @Override
    void disConnect(){
        System.out.println("Call DisConnect....");
    }
    void camera(){
        System.out.println("Opeaning Camera....");
    }
}

public class First12 {
    public static void main(String[] args) {
        //run time Polymorephism
        SmartTelPhone smt = new SmartTelPhone();
        smt.ring();
        smt.lift();
        smt.disConnect();
        smt.camera();


    }

}
