package Oops_Concept.java;

 class Employee{
     int id;
     int salary;
     String name;
     public void  printDetail(){
         System.out.println("My id is: "+id);
         System.out.println("and my name is: "+name);
     }
    public int getSalary(){
        return salary;
    }
 }
public class First1 {
    public static void main(String[] args) {
        Employee harry = new Employee();
        Employee ASK = new Employee();

        harry.id = 21;
        harry.name = "Harry";
        harry.salary = 21000;

        ASK.id = 21;
        ASK.name = "Ask";

        harry.printDetail();
        ASK.printDetail();

        int Salary = harry.getSalary();
        System.out.println("Salary is: "+Salary);

       // System.out.println(harry.id);
       // System.out.println(harry.name);
    }
}
