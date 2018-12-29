/*
Michael Rios
COSC 600
Project 2
 */

package project2;


import java.util.Scanner;

public class accounts {
    
    protected String name;//all the data needed for accounts using protected form so it can be used by inhertitance
    protected int account;
    protected String phoneNumber;
    protected String SSN;
    protected int balance;
    protected char type;
    Scanner reader = new Scanner(System.in);//used to read input from screen

    //constructor 
    public accounts(String name1, int account1, String phoneNumber1, String SSN1, int balance1, char type1){
        name = name1;
        account = account1;
        phoneNumber = phoneNumber1;
        SSN = SSN1;
        balance = balance1;
        type = type1;
    }
    
    public void getData(accounts Account){//display all the get statements needed to fill in information
        //for the account, 
    Account.getName();
    Account.getAccount();
    Account.getBalance();
    Account.getPhone();
    Account.getSSN();  
    Account.getType();//The way the code is now this is not really needed but I kept it in for the time being
 
    }
    
    public void getMostData(accounts Account){//display all the get statements needed to fill in information,
        //for the account. Leaves out account type as it is know.
    Account.getName();
    Account.getAccount();
    Account.getBalance();
    Account.getPhone();
    Account.getSSN();  
    
    }
    
    
    //allows users to enter data on screen for all get Methods
    public void getName(){
        
        System.out.print("Please enter the user's name: ");
        name = reader.next();
    }
    
    public void getAccount(){
        
        System.out.print("Please enter the user's account number: ");
        account = reader.nextInt();
    }
    
    public void getPhone(){
        
        System.out.print("Please enter the user's phone number: ");
        phoneNumber = reader.next();
    }
    
    public void getSSN(){
        
        System.out.print("Please enter the user's SSN: ");
        SSN = reader.next();
    }
    
    public void getBalance(){
        
        System.out.print("Please enter the user's Balance: ");
        balance = reader.nextInt();
    }
     
    public void getType(){
        
        System.out.print("Please enter the type of account the user has: B = Business; C = Checking; S = Savings");
        type = reader.next().charAt(0);
    }    
    
    //shows user information
    public void showUsersInfo(){
        
        System.out.printf("%s        %d         %s       %s \n", name, account, phoneNumber, SSN);
        
    }
    
    //allows people to access private data
    public String returnName(){
        
        return name;
    }
    
    public int returnAccount(){
        
        return account;
    }
    
    public String returnPhoneNumber(){
        
        return phoneNumber;
    }
    
    public String returnSSN(){
        
        return SSN;
    }

        
    public int returnBalance(){
        
        return balance;
    }
    
    public char returnType(){
        
        return type;
    }

    public void interest(){
}

}
