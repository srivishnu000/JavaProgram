public class L5p3
 {
    private long accountNumber;
    private String accountType;
    private double amount;

   
    public L5p3(long accountNumber, String accountType, double amount) {
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.amount = amount;
    }

        public L5p3(long accountNumber, String accountType) {
        this(accountNumber, accountType, 0.0); 
    }

       public L5p3(long accountNumber) {
        this(accountNumber, "Savings", 0.0);     }

      public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public static void main(String[] args) {
                L5p3customer1 = new BankCustomer(123456789, "Savings", 1000.0);
        L5p3customer2 = new BankCustomer(987654321, "Checking");
        L5p3 customer3 = new BankCustomer(111222333);

                System.out.println("Customer 1:");
        System.out.println("Account Number: " + customer1.getAccountNumber());
        System.out.println("Account Type: " + customer1.getAccountType());
        System.out.println("Amount: " + customer1.getAmount());

        System.out.println("\nCustomer 2:");
        System.out.println("Account Number: " + customer2.getAccountNumber());
        System.out.println("Account Type: " + customer2.getAccountType());
        System.out.println("Amount: " + customer2.getAmount());

        System.out.println("\nCustomer 3:");
        System.out.println("Account Number: " + customer3.getAccountNumber());
        System.out.println("Account Type: " + customer3.getAccountType());
        System.out.println("Amount: " + customer3.getAmount());
    }
}
