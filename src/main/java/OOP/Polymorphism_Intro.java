package OOP;

public class Polymorphism_Intro extends Employee {
    /*
        1. Compile time (Method overload)
        2. Runtime (Method Override)
     */

    //Example of Method overload

    public int sumOfTwo (int a, int b){
        System.out.println("this is an int method");
        return  a +b;
    }

    public double sumOfTwo (double a, double b){
        System.out.println("this is a double method");
        return a+b;
    }

    public String sumOfTwo(String a, String b){
        System.out.println("this is String method");
        return a+ b;
    }

    public String sayHello(String empName){
        return "Hello from Intro Class: " + empName;
    }

    public static void main(String[] args) {
        Polymorphism_Intro intro = new Polymorphism_Intro();
        System.out.println(intro.sumOfTwo("abd","10"));

        Employee employeeOne = new Polymorphism_Intro();
        System.out.println(employeeOne.sayHello("Mark"));

        Employee employeeTwo = new Employee();
        System.out.println(employeeTwo.sayHello("Josh"));
    }
}

class Employee{

    public String sayHello(String empName){
        return "Hello from Employee Class: " + empName;
    }

}