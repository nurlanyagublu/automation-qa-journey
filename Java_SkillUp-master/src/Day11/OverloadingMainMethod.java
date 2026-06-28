package Day11;

public class OverloadingMainMethod {

    void main(int x) {
        System.out.println("x is " + x);
    }

    void main(int x, int y) {
        System.out.println("x is " + x + " and y is " + y);
    }

    void main(int x, int y, int z) {
        System.out.println("x is " + x + " and y is " + y + " and z is " + z);
    }

    public static void main(String[] args) {
        OverloadingMainMethod m = new OverloadingMainMethod();
        m.main(10);
    }
}
