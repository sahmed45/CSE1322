package CSE1321;
import java.util.*;
public class TestBankAccount
{
   public static void main (String[] args) 
   {
   BankAccount myObject = new BankAccount(123456,10000);
   
   System.out.println("Account ID is " + myObject.getID());   
   System.out.println("Initial balance is $10000 ");   
   System.out.println("Annual Interest Rate is 2.5% "); 
   myObject.setAnnualInterestRate(0.0025);   
   myObject.withdraw(3500);  
   myObject.deposit(500) ;  
   System.out.println("Closing Balance  " + ((myObject.getBalance()+ myObject.getMonthlyInterest())));
   System.out.println("Monthly Interest  " + myObject.getMonthlyInterest());
   System.out.println("Date Opened " + myObject.dateCreated());
  }
  
 }