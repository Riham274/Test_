import java.util.function.Consumer;
import java.util.function.Predicate;

interface Greeting {

    void sayHello();

}

class Hello implements Greeting {

    public void sayHello() {

        System.out.println("Hello");

    }

}

@FunctionalInterface
interface Test {

    void run();
    // void run2(); error

}

// without lambda expression
class MyTest implements Test {

    public void run() {

        System.out.println("Running test");

    }

}

class Main {
    public static void main(String[] args) {
        // Greeting greeting = new Hello();
        // greeting.sayHello();

        Greeting g = () -> System.out.println("Hello");
        g.sayHello();

        //without lambda expression
        Test t = new MyTest();
        t.run();

        // with lambda expression
        Test t2 = () -> System.out.println("Running test"); //run method body
        t2.run(); //call the code inside lambda expression

        Predicate<Integer> p = x -> x > 10;
        System.out.println(p.test(15)); // true
        System.out.println(p.test(5)); // false

        Consumer<String> c = name -> System.out.println(name);
        c.accept("Alice"); // Alice

    }

}