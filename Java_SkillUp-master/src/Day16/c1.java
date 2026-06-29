package Day16;

public class c1 extends c2 implements i1, i2    // this is also hybrid inheritance
{

    public void m1() {
       System.out.println(x);
   }

   public void m2() {
        System.out.println(y);
   }


    public static void main(String[] args) {

        c1 c1obj = new c1();
        c1obj.m1();
        c1obj.m2();
    }
}
