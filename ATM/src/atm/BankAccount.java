package atm;
import java.util.*;

public class BankAccount {
    private String name;
    private String password;
    private double balance;

    public BankAccount(String name, String password, double balance) {
        this.stack = new Stack<>();
        this.next = new Stack<>();
        this.name = name;
        this.password = password;      
        if (balance>0.0)
        {
        this.balance = balance;
        stack.push(balance+"");
        }
        else 
        {
            System.out.println("Invalid Balance ! ");
        }
    }
    Stack <String> stack;
    Stack <String> next;

    BankAccount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
          this.balance = balance;
    }
     public  String previous()
     {
     if (stack.empty()==false)
     {
      String x = stack.pop();
      next.push(x);
      return x;
     }
     else {
        System.out.println("No History !");
     }
       return null;
          }
    public double deposit(double x){
        balance += x;
        stack.push(x+"  deposited ");
        return balance;
    }
    public double withdrawal(double y)
    {
       balance -=y;
       stack.push(y+"  Withdrawn");
       return balance;
    }
    public String next ()
    {
        if (next.empty()==false)
        {
            String x=next.pop();
        stack.push(x);
        return x;
        }
        else 
        {
            System.out.println("No History !");
        }
        return null;
        
    }
}
