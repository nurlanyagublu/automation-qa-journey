package Day11;

public class Account {

   private int accno;
   private String name;
   private double balance;

   void setAccno(int accno) {
        this.accno = accno;  //if the parameter and variable is the same then it's going to return 0, because setAccno method does not know which one is local and class variable
       //that's why we need to use THIS in that case

   }

   int getAccno () {
    return accno;
   }
}
