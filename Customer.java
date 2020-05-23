// AP CS A
// Chapter 10 Programming Assignment
// Kyle Jambretz and Noah Fairchild

public class Customer extends BankClass
{
    private String [] accountNumbers;
    private int pin;
    private double money;
    
    public Customer()
    {    
        super();
        this.accountNumbers = new String[2];
        this.pin = 0;
        this.money = 0;
    }
    
    public Customer(String name, String phoneNumber, String id, String[] accountNumbers, int pin, double money)
    {
        super(name, phoneNumber, id);
        this.accountNumbers = accountNumbers;
        this.pin = pin;
        this.money = money;
    }
      
    public void withdraw(double amount)
    {
        if(amount <= money)
        {
            this.money -= amount;
        }
    }
    
    public void deposit(double amount)
    {
        this.money += amount;
    }
}
