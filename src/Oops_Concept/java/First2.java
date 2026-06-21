package Oops_Concept.java;


class Employee1{
    int salary;
    String name;

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class First2 {
    public static void main(String[] args) {
        Employee1 emp = new Employee1();
        emp.setSalary(5000);
        emp.setName("_Rohit:Kr->");
        System.out.println("Name: "+emp.getName());
        System.out.println("Salary: "+emp.getSalary());
    }
}
