// AP CS A
// Chapter 10 Programming Assignment
// Kyle Jambretz and Noah Fairchild

public class BankClient 
{
  public static void main(String [] args)
  {
    BankClass customer1 = new Customer("Traves Grompey", "123-456-7890", "0001", new String[] {"5415431", "235123"}, 2525, 1.02);
      BankClass customer2 = new Customer("Rahjeesh", "173-486-8638", "0002", new String[] {"7584939", "769305"}, 0355, 10000.00);
      BankClass employee1 = new Employee("Sluggo Pratt", "911", "995978", 12.59, 168.0);
      Employee teller1 = new Teller("Stringname", "String phoneNumber", "String id", 15398.56, 40.0, 15);
      Employee securityGuard1 = new Security("Paul Blart Mall Cop", "585-223-2930", "1",10.50, 24.0);
      
      customer1.deposit(2.0);
      
      customer2.withdraw(100);
  }
}