package Day15;



class Bank {

    double roi()
    {
        return 0;
    }
}


class Pasha extends Bank {

    double roi()
    {
        return 10.5;
    }
}

class ABB extends Bank {

    double roi()
    {
        return 11.5;
    }
}

public class OverridingDemo {

    public static void main(String[] args) {
    Pasha p = new Pasha();
    ABB a = new ABB();
    System.out.println(p.roi());
    System.out.println(a.roi());

    }
}
