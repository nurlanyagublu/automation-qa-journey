package Day18;

public class FinallyBlock {

    public static void main(String[] args) {

        System.out.println("Program is started...");

        String s="welcome";

        try {
            System.out.println(s.length());
        }
        catch(NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("You entered into finally block...");
        }
        System.out.println("Program is completed...");
    }
}
