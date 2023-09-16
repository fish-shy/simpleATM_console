import java.util.Scanner;



public class User { 
    private String name;
    ATM ATM = new ATM();
    
    public String GetName()
    {
        return name;
        
    }
    
    
    public void choice()
    {
    int money = ATM.GetMoney();
    Scanner scanner = new Scanner(System.in);    
    System.out.print ("enter your name : ");
    name = scanner.nextLine();    
        int choice;
        do{
        
        System.out.print(" ATM  \n ******************************** \n"+ name + " money = " + money +  "\n1. Deposit \n"
                + "2. Withdraw \n3. Show balance \n4. Transfer \n0. Exit \n ******************************** \n "
                + "choice : ");
        choice = scanner.nextInt();
        switch (choice)
        {
            case 1:
                money = ATM.Deposit(name);
                break;
             
            case 2:
                money = ATM.Withdraw(name);
                break;
                
            case 3:
                System.out.println(name + " money = "  + money);
                break;
                        
            case 4:
                money = ATM.Transfer(name);
                break;
                
            default:
                System.out.println("enter a valid input ");
                break;
        }            
        
        }while(choice != 0);
        
        System.out.println("Thank you comeback later ");
        scanner.close(); 
    }
    
    
    
    
    
    
    
   
    
}

