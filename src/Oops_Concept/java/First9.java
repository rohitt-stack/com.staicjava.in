package Oops_Concept.java;

class Monkey{
    void jump(){
        System.out.println("The Monkey is jump");
    }
    void bite(){
        System.out.println("The mokey is bite");
    }
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal{
    void speak(){
        System.out.println("speak hello rrr..");
    }
    public void eat(){
        System.out.println("eating....");
    }
    public void sleep(){
        System.out.println("sleepig......");
    }
}
public class First9 {
    public static void main(String[] args) {
        Human h = new Human();
        h.speak();
        h.jump();
        h.bite();
        h.sleep();
    }
}
