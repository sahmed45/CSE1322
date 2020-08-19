package CSE1321;
import java.util.*;

public class BankAccount
{
   private int id = 0;
   private double balance = 0.0;
   private double annualInterestRate = 0.0;
   private Date d = new Date();
      
   public BankAccount()
   {
   }
   public BankAccount(int newId, int newBalance)
   {
   id = newId;
   balance = newBalance;
   }
   public Date dateCreated()
   {
   return d;
   }
   public double getID()
   {
   return id;
   }
   public double getBalance()
   {
   return balance;
   }
   public void setAnnualInterestRate(double value)
   {
   annualInterestRate= value;
   }
   public double getMonthlyInterestRate()
   {
   return annualInterestRate/12*100;
   }
   public double getMonthlyInterest()
   {
   return balance * annualInterestRate/12;
   }
   public void withdraw(int value)
   {
   balance = balance - value;
   }
   public void deposit(int value)
   {
   balance = balance + value;
   }  

}

