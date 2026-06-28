package Day16;


interface Shape {
    int length=10;  //final & static
    int width=20;   //final & static

    void circle();   //abstract method


    default void square() {
        System.out.println("this is square - default method...");
    }

    static void rectangle() {
        System.out.println("this is rectangle - static method");
    }
}

public class InterfaceDemo implements Shape
{
    public void circle()
    {
        System.out.println("this is circle - abstract method...");
    }

    void triangle()
    {
        System.out.println("this is triangle....");
    }

    public static void main(String[] args) {

        //scenario 1
        /*InterfaceDemo iobj=new InterfaceDemo();
        iobj.circle();
        iobj.square();

        Shape.rectangle(); */  //static method can directly access from interface

        //Scenario 2
        Shape sh = new InterfaceDemo();

        sh.circle();
        sh.square();
        Shape.rectangle(); //static method can directly access from interface

        //sh.triangle();  // we cannot access

        System.out.println(Shape.length * Shape.width);  // accessing static variable
    }
}
