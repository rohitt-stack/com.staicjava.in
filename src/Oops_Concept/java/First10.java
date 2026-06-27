package Oops_Concept.java;
class Monkey2{
    void jump(){
        System.out.println("The Monkey is jump");
    }
    void bite(){
        System.out.println("The mokey is bite");
    }
}
interface BasicAnimals{
    void eat();
    void sleep();
}
class Human1 extends Monkey implements BasicAnimal{
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
public class First10 {
    public static void main(String[] args) {
        Monkey2 h = new Monkey2(); //Encapsulation Format
        h.jump();
        h.bite();
    }
}
