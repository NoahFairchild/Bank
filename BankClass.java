// AP CS A
// Chapter 10 Programming Assignment
// Kyle Jambretz and Noah Fairchild

public abstract class BankClass implements BankInterface
{
    private String name;
    private String phoneNumber;
    private String id;
    
    public BankClass()
    {
        name = "";
        phoneNumber = "";
        id = "";
    }
    
    public BankClass(String name, String phoneNumber, String id)
    {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.id = id;
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
        
    public String getName()
    {
        return this.name;
    }
        
    public void setPhoneNum(String number)
    {
        this.phoneNumber = number;
    }
    
    public String getPhoneNum()
    {
         return this.phoneNumber;   
    }
    
    public void setID(String id)
    {
        this.id = id;
    }
    
    public String getID()
    {
        return this.id;
    }
}