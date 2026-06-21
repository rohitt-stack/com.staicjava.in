package Oops_Concept.java;

class CellPhone{
    public void ring(){
        System.out.println("ringing....");
    }
    public void vibrate(){
        System.out.println("vibring....");
    }
    public void call(){
        System.out.println("calling....");
    }
}
public class First3 {
    public static void main(String[] args) {
        CellPhone vivo = new CellPhone();
        vivo.ring();
        vivo.vibrate();
        vivo.call();

    }
}
