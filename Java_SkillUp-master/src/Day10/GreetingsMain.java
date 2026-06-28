package Day10;

public class GreetingsMain {

    public static void main(String[] args) {

        Greetings gr=new Greetings();
        gr.m1();   //1
        String s=gr.m2();
        System.out.println(s);

        gr.m3("McGregor");
        String f=gr.m4("Turan");
        System.out.println(f);

    }
}
