public class EmployeeProgram{
private int empID;
private String empname;
private double Salary;
public EmployeeProgram(int empID, String empname,double Salary)
{
this.empID=empID;
this.empname=empname;
this.Salary=Salary;
}
public void displayEmployee()
{
System.out.println("Employee ID: " +empID);
System.out.println("Employee Name: " +empname);
System.out.println("Employee Salary:" +Salary);
} 
public static void main(String args[]){
  EmployeeProgram e = new EmployeeProgram(1,"vishnu",30000.0);
  e.displayEmployee();
}
}
   