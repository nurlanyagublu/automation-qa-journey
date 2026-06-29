package Day11;

public class BoxMain {

    public static void main(String[] args) {
        //Box box = new Box();  //1
        //Box box = new Box(10.5, 15.5, 5.0); //2
        Box box = new Box(10.5); //3

        System.out.println(box.volume());
    }
}
