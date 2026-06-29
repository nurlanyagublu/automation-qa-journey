package Day10;

public class StudentMain {

    public static void main(String[] args) {

        //Student student = new Student();
        //1 using object reference variables

        /*student.sid=10;
        student.name="John";
        student.grade='A';

        student.printStudentData(); */

        //2 using method
        /*student.setSudentData(101,"Khabib", 'B');
        student.printStudentData();*/

        //3 using constructor  (can not return any value)
        Student student = new Student(101, "John", 'A');
        student.printStudentData();








    }
}
