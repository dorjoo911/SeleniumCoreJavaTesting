package OOP;

public class StaticClass {

    // static var
    public static int numOne = 100;

    //non static var
    public double someNumber = 23.99;


    static void display(){
        System.out.println("Value of NumOne " + numOne);

        //We cannot access non-static variable inside static method without const call;
        StaticClass staticClass = new StaticClass();
        staticClass.someNumber = 44.88; //using const we can access not static values.
    }

    void methodOne(){

        // Non-static method can access static and non-static variable, method as well.
        display();
        numOne =300;
        someNumber =39.78;
    }

    public static void main(String[] args) {
        display();
        StaticClass staticClass = new StaticClass();
        staticClass.methodOne();
    }

    //Class with  the class
    static class MyStaticClass{

        /*
            we can static and non-static method.
         */
        void methodTwo(){
            display();
            numOne= 200;
        }

        public static void main(String[] args) {
            display();
        }
    }
}
