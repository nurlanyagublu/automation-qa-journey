package Day9;
//if the class is not in the same package then
//import packagename.classname;

public class EmployeeMain {

    public static void main(String[] args) {

        Employee emp1 = new Employee();   //object
        emp1.eid=8;
        emp1.ename="Bruno";
        emp1.job="Central Attacking Midfielder";
        emp1.salary=5000;

        emp1.display();
    }
}
