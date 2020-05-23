// AP CS A
// Chapter 10 Programming Assignment
// Kyle Jambretz and Noah Fairchild

public class Teller extends Employee
{   
    private int deskNumber;
    
    public Teller()
    {    
        super();
    }
    
    public Teller(String name, String phoneNumber, String id, double salary, double hours, int deskNumber)
    {
        super(name, phoneNumber, id, salary, hours);
        this.deskNumber = deskNumber;
    }
    
    public void completeWireTransfer(int wireNumber)
    {
        System.out.println("Wire transfer: " + wireNumber + "has been completed");
    }
}
