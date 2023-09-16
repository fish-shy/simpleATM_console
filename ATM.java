/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Hafiz
 */
import java.util.Scanner;


public class ATM {    
    private int money= 1000;
    public int GetMoney()
    {
        return money;
    }
    public int Transfer (String name)
   {
       Scanner scanner = new Scanner(System.in);
       String toName;
       System.out.print("who do you want to transfer to : "); 
       scanner.nextLine();
       System.out.print("how much would you like to transfer :  ");
       int temp = scanner.nextInt();
       if(money < temp) // kalo kd cukup duit error
       {
           System.out.println("you dont have enough money");;
           return money;
       
       }
       return money-+ temp;
   }
    public int Withdraw(String name)
    {
        System.out.println(name + "  money = " + money );
        Scanner scanner= new Scanner(System.in); 
        int nums = money;
        System.out.println(name + " money = "  + money);
        System.out.print("how much would you like to transfer : ");
        nums = scanner.nextInt();        
       if  (nums <= money)
        {
            System.out .println("enter a valid number");
            return money;
        }  
       
        else
        {
            money -= nums;
            System.out.println(name + "  money = " + money );
            return money;
        }
            
  }  
    public int Deposit(String name)            
    {
        Scanner scanner= new Scanner(System.in); 
        int nums = money;
        System.out.println(name + " money = "  + money);
       
       
        System.out.print("how much would you like to deposit : ");
        nums = scanner.nextInt();
       
        if(nums > 0){
        
        money += nums;
        System.out.println(name + " money = " + money );
        return money ;
        }        
         else
        {
        System.out.println("plese enter a valid number");
        return money;
        }      
  }
}

