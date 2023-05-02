package Inheritance;
class account {
    private String AccNo;
    private String name;
    private String address;
    private String dob;
    private String phno;
    protected long balance;

    public account(String acc, String n, String adder, String dob, String phno){
        AccNo = acc;
        name = n;
        address = adder;
        this.dob = dob;
        this.phno = phno;
        balance = 0;
    }
    public String getAccNo(){return AccNo;}
    public String getName(){return name;}
    public String getAddress(){return address;}
    public String getPhno(){return phno;}
    public String getDob(){return dob;}

    public void setAddress(String adder) {
        address = adder;
    }
    public void setPhno(String phno) {
        this.phno = phno;
    }
}
class SavingAccount extends account{

    public SavingAccount(String acc, String n, String adder, String dob, String phno) {
        super(acc, n, adder, dob, phno);
    }

    public void deposit(long amt){
        balance +=amt;
    }
    public void withdraw(long amt){
        balance -= amt;
    }
}
class LoanAccount extends account{

    public LoanAccount(String acc, String n, String adder, String dob, String phno) {
        super(acc, n, adder, dob, phno);
    }

    public void PayEMI(long amt) {
        balance -= amt;
    }
    public void repay(long amt){
        if(balance == amt)
            balance = 0;
    }
}

public class Bank_Inherit {
    public static void main(String[] args) {

    }

}

























