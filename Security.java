// AP CS A
// Chapter 10 Programming Assignment
// Kyle Jambretz and Noah Fairchild

public class Security extends Employee
{
    
    public Security()
    {    
        super();
    }
  
    public Security(String name, String phoneNumber, String id, double salary, double hours)
    {
        super(name, phoneNumber, id, salary, hours);
    }
    
    public void stopThief()
    {
        System.out.println("Don't Steal!");
    }
    
    public void patrol()
    {
        System.out.println("The security guard patrols the bank.");
    }
    
}
