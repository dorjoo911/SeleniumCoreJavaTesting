package OOP;

public class AbstractionInJava extends Demo implements MyInterfaceOne, MyInterfaceTwo {
    @Override
    public void abstractMethod() {
        System.out.println("Hello from the child class");
    }
    /*
        1. Abstract Class
        2. Interface
     */

    public static void main(String[] args) {
        AbstractionInJava abstraction = new AbstractionInJava();
        abstraction.abstractMethod();
        abstraction.sayHelloFromInterfaceOne();
        abstraction.sayHelloFromInterfaceTwo();
        abstraction.someMethod();
    }

    @Override
    public void sayHelloFromInterfaceOne() {
        System.out.println("This is from interface one");

    }

    @Override
    public void sayHelloFromInterfaceTwo() {
        System.out.println("This is from interface two");

    }

    @Override
    public void someMethod() {
        System.out.println("This from grand parent");
    }
}
abstract class Abc{
    public abstract void someMethod();
}

abstract class Demo extends Abc{
    /*
        don't have to create method body
        All the method in abstract are usually abstract method
     */

    public abstract void abstractMethod();
}

interface MyInterfaceOne{
    /*
        all method in interface are public abstract
     */

    void sayHelloFromInterfaceOne();
}

interface MyInterfaceTwo{
    void sayHelloFromInterfaceTwo();
}