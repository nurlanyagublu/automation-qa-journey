package Day10;

public class Greetings {

    //no params(arguments)  no return value

    void m1() {
        System.out.println("Hello....");
    }

    //no params  returns value

    String m2() {

        return "Hello how are you??";
    }

    //params no return value

    void m3(String name) {

        System.out.println("Hello " + name);
    }

    //params   returns value

    String m4(String name) {

        return ("Hello " + name);
    }
}
