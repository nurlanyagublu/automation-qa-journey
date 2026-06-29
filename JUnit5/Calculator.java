package JUnit5.JUnit5;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return (double) a / b;
    }

    public String describe(int a, int b) {
        if (a > b) return "greater";
        if (a < b) return "lesser";
        return null;
    }
}
