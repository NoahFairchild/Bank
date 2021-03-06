// AP CS A
// Chapter 10 Programming Assignment
// Kyle Jambretz and Noah Fairchild

public class Employee extends BankClass
{
    private double salary;
    private double hours;
    
    public Employee()
    {
        super();
        this.salary = 0.0;
        this.hours = 0.0;
    }
    
    public Employee(String name, String phoneNumber, String id, double salary, double hours)
    {
        super(name, phoneNumber, id);
        this.salary = salary;
        this.hours = hours;
    }
    
    public double getSalary()
    {
        return this.salary;
    }
    
    public void setSalary(double salary)
    {
        this.salary = salary;
    }
    
    public void pullAlarm()
    {
        System.out.println("ALARM!!!");
    }
    
}
