package Oops_Concept.java;

class Rohit{
    public void hit(){
        System.out.println("Hitting the Enemy~~~~~``>");
    }
    public void run(){
        System.out.println("Running from the Enemy-_-_-_-_->");
    }
    public void fire(){
        System.out.println("Firing on the Enemy.......->");
    }
}
public class First5 {
    public static void main(String[] args) {
        Rohit player = new Rohit();
        player.hit();
        player.run();
        player.fire();
    }

}
