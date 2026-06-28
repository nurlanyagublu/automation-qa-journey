package Day19;

class Parent {
    String name="John";
    void m1()
    {
      System.out.println("This is m1 from Parent");
    }
}

class Child extends Parent {
    int id=101;
    void m2()
    {
        System.out.println("This is m2 from Child");
    }
}

public class TypeCastingObjects1 {

    public static void main(String[] args) {

        /*Parent p=new Child(); //upcasting
        System.out.println(p.name);  //Parent
        p.m1();

        System.out.println(p.id); //we can't access
        p.m2();  //we can not access*/


        //downcasting
        Parent p1=new Parent();
        Child c=(Child)p1;

        System.out.println(c.id);
        System.out.println(c.name);
        c.m1();
        c.m2();

    }
}
