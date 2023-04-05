package data_hiding;

public class BankAccount {
    private double balance= 1000000;
    private String username="MyUserName";
    private String password="MyPassWord";
    public double getBalance(String username,String password)
    {
        if(this.username.equals(username) && this.password.equals(password))
            return balance;
        else
            return 0.0;
    }
}
