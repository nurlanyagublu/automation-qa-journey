package Day14;


class A {
    int a=100;
    void display()
    {
        System.out.println("a="+a);
    }
}

class B   extends A
{
    int b=200;
    void show()
    {
        System.out.println("b="+b);
    }
}


public class InheritanceTypes {

    public static void main(String[] args) {

        B bobj=new B();

        System.out.println(bobj.a);

    }
}
