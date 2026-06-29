package Day10;

public class Student {

    int sid;
    String name;
    char grade;

    void printStudentData() {
        System.out.println(sid+"   "+name+"   "+grade);
    }

    void setSudentData(int id,String sname,char grad) {
        sid=id;
        name=sname;
        grade=grad;
    }

    // constructor method, name should be the same with the class
    //used just for initializing the data, can't do loop, condition and etc
    Student(int id, String sname, char grad) {
        sid=id;
        name=sname;
        grade=grad;
    }

}
