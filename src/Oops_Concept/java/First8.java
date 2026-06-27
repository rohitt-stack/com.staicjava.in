package Oops_Concept.java;

abstract class pen {
    abstract void write();

    abstract void refill();
}
class FountainPen extends pen {
    void write() {
        System.out.println("write");
    }
    void refill() {
        System.out.println("refill");
    }
    void ChangeNibb(){
        System.out.println("ChangeNibb");
    }
}
public class First8 {
    public static void main(String[] args) {
        FountainPen fp = new FountainPen();
        fp.write();
        fp.refill();
        fp.ChangeNibb();
    }
}
