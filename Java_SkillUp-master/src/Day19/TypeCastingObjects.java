package Day19;

//cat ct=(cat)a;
//    a b  c   d


class Animal
{

}

class dog extends Animal {}
class cat extends Animal {}

public class TypeCastingObjects {

    public static void main(String[] args) {

        //Rule 1: Conversion is valid or not
        //Tye type of 'd' and 'c' must have some relationship(either parent to child or child to parent)

        //Animal a=new dog();
        //cat c=(cat)a; //valid as per rule 1

        //dog dg=new dog();
        //cat ct=(cat) dg;  //invalid as per Rule1

        //Rule2 : assignment is valid or not
        // 'c' must be either same or child of 'a'

        //Animal an=new dog();
        //cat ct = (cat) an;  //valid as per Rule2
        //a   b     c    d

        //Animal an = new dog();
        //cat ct=(dog) an;   //invalid as per Rule2

        //Rule3: The underlying object type of 'd' must be either same or child of 'C'.

        //Animal an =new dog();
        //cat ct=(cat)an; //not valid

        //Rule 1, Rule 2, Rule 3
        Animal an=new dog();
        dog dg=(dog)an;    //Rule1-yes  Rule2-yes  Rule3-yes


    }
}
