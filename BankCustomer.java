public class BankCustomer {
    private int acno;
    private String atype;
    private double amt;
    
    
    public BankCustomer(int acno, String atype, double amt) {
        this.acno = acno;
        this.atype = atype;
        this.amt = amt;
    }
    

    public BankCustomer(int acno, String atype) {
        this(acno, atype, 0.0);
    }
    
    
    public int getAcno() {
        return acno;
    }
    
    public void setAcno(int acno) {
        this.acno = acno;
    }
    
    public String getAtype() {
        return atype;
    }
    
    public void setAtype(String atype) {
        this.atype = atype;
    }
    
    public double getAmt() {
        return amt;
    }
    
    public void setAmt(double amt) {
        this.amt = amt;
    }
    
       public String toString() {
        return "BankCustomer{" +
                "acno=" + acno +
                ", atype='" + atype + '\'' +
                ", amt=" + amt +
                '}';
    }
    

    public static void main(String[] args) {
               BankCustomer customer1 = new BankCustomer(123456, "Savings", 1000.0);
        BankCustomer customer2 = new BankCustomer(789012, "Checking");
        
               System.out.println("Customer 1: " + customer1);
        System.out.println("Customer 2: " + customer2);
    }
}