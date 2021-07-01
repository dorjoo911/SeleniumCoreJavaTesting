package OOP;

public class AboutConstructor {

    /*
        1. Default
        2. No-arg
        3. With Args
     */
    public static void main(String[] args) {

        // Call to default Constructor
        AboutConstructor constructor = new AboutConstructor();
        constructor.sayHello();
        AboutConstructor constructorOne = new AboutConstructor("User1", "Message");

        // We cannot call static method using constructor
        staticMethod();
    }

    //how to declare class constructor
    // public className(){}
    public AboutConstructor(){
        System.out.println("No-arg constructor");
    }

    public AboutConstructor(String name, String message){
        System.out.println("With args constructor");
        System.out.println(name);
        System.out.println(message);
    }

    public void sayHello(){                 // instance constructor
        System.out.println("Hello from instance");
    }

    public static void staticMethod(){      //static constructor
        System.out.println("static from static method");
    }
}

