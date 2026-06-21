package Oops_Concept.java;

class Square{
    int side;

    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}
public class First4 {
    public static void main(String[] args) {
        Square sq = new Square();
        sq.side = 10;
        System.out.println("Area of square: "+sq.area());
        System.out.println("Perimeter of square: "+sq.perimeter());
    }
}
