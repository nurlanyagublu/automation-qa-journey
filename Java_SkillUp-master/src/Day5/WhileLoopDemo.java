package Day5;

public class WhileLoopDemo {

    public static void main(String[] args) {

        int i = 1;

        while (i<=10) {
            if (i % 2 == 0) {
                System.out.println(i + " even");
            }
            else {
                System.out.println(i + " odd");
            }
            i=i+1;
        }
    }
}
