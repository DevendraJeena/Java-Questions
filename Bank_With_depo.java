// Define class Bank with data members as Cust_name, Ac_no and balance.
//  Use constructors and method withdraw and deposit. Print the balance according to operation.

import java.util.*;

class Bank_details{

    String name ;
    int account_No ;
    int balance ;

    public Bank_details(String cust_name , int cust_account_No , int balance){
        this.name = cust_name;
        this.account_No = cust_account_No;
        this.balance = balance;
    }

    public void print_Bank_details(){
        System.out.println("customer name :"+ name);
        System.out.println("account number :" + account_No);
        System.out.println("balance :"+ balance);
    }

    public void withdraw(int  amount){
       
        if(amount>balance ){
            System.out.println("insufficiant balance");
        }else if(amount <= balance){
            balance -= amount ;
            System.out.println("withdrawal amount : "+ amount);
            System.out.println("current balance :" + balance);
        }else{
            System.out.println("invalid amount");
        }
      
    }

    public void deposit(int amount){
        if(amount>0){
            balance += amount;
            System.out.println("deposited amount :"+ amount);
            System.out.println("current balance :" + balance);

        }else{
            System.out.println("invalid amount");
        }
       
    }
}


public class Bank_With_depo{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the name of person :");
        String cust_name = sc.nextLine();
        System.out.println("enter the account number :");
        int cust_account_No = sc.nextInt();
        System.out.println("enter the balance :");
        int balance = sc.nextInt();
        
   Bank_details p1 = new Bank_details(cust_name , cust_account_No , balance);

     System.out.println("details of person1 :");
     p1.print_Bank_details();
     
     System.out.println("enter 1 to withdraw and 2 to deposit");
     int option = sc.nextInt();


    switch(option){
     
    case 1 :
    System.out.println("enter the amount to withdraw");
     int amount =sc.nextInt();
    p1.withdraw(amount);
    break ;
    
    case 2 :
    System.out.println("enter the amount to deposit");
     amount = sc.nextInt();
    p1.deposit(amount);
    break ;

    default :
    System.out.println("invalid :please select no 1 or 2");
   }
   


    }
}
