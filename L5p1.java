public class L5p1
{
private int accountNumber;
private String accountType;
private double balance;

public L5p1(int accountNumber, String accountType, double balance)
{
this.accountNumber = accountNumber;
this.accountType = accountType;
this.balance = balance;
}
public int getAccountNumber()
{
return accountNumber;
}
public void setAccountNumber(int accountNumber)
{
this.accountNumber = accountNumber;
}
public String getAccountType()
{
return accountType;
}
public void setAccountType(String accountType)
{
this.accountType = accountType;
}
public double getBalance()
{
return balance;
}
public void setBalance(double balance)
{
this.balance = balance;
}
public static void main(String[] args)
{
L5p1 customer1 = new L5p1 (123456, "Savings", 1000.0);
System.out.println("Account Number: " + customer1.getAccountNumber());
System.out.println("Account Type: " + customer1.getAccountType());
System.out.println("Balance: " + customer1.getBalance());
}
}

