/*
Michael Rios
COSC 600
Project 2
 */

package project2;

import java.io.File;
import java.util.Scanner;

/**
 *
 * @author mike
 */
public class Miscellenous {//Input/output would have probably been a better title
    //for this.  It is a place to hold methods to keep the driver looking clean

    private String name;//all the data needed for accounts
    private int account;
    private String phoneNumber;
    private String SSN;
    private int balance;
    private char type;
    Scanner reader = new Scanner(System.in);//used to read input from screen
   
  
    public int numberOfUsers(){//lets us know how many users we have in file. 
    //Assumes each line is a new user    
    
    int users = 0;
    
    try{ 
        Scanner sc = new Scanner(new  File("userData.txt"));
        while (sc.hasNextLine()){
            sc.nextLine();
            users++;}    
     }
            catch(Exception e)
                {System.out.println("Error"+e.toString());}
    
    return users;
    
}
    
    public accounts[] fillArray(int users){//gets all the data from the file
            //file. Gets data one line at a time  
    
        accounts[] patrons = new accounts[users];
        int i = 0;
        
        try{ 
        Scanner sc = new Scanner(new  File("userData.txt"));
        while (sc.hasNext()){
        name = sc.next();//extracts apprioate data
        account = sc.nextInt();
        phoneNumber = sc.next();
        SSN = sc.next();
        balance = sc.nextInt();
        type =  sc.next().charAt(0);
        
        //figures out what kind account the user has and creates that kind of account
        if (type == 'B'){
            bussinessAccount theAccount = new bussinessAccount(name, account, phoneNumber, SSN, balance, type);    
        
            patrons[i] = theAccount;
        }

        else if (type == 'C'){
            checkingAccount theAccount = new checkingAccount(name, account, phoneNumber, SSN, balance, type);
            patrons[i] = theAccount;
        }
        else if (type == 'S'){
            savingsAccount theAccount = new savingsAccount(name, account, phoneNumber, SSN, balance, type);
            patrons[i] = theAccount;
        }
        
        i++;//keeps the array moving
        }}
        catch(Exception e)
                {System.out.println("Error"+e.toString());}

    return patrons;     
    }
    
    public void output(int users, accounts[] patrons){//outputs user data 
        
        System.out.println("Name     Account Number    Phone Number          SSN");
    
        System.out.println("____________________________________________________");
        for (int i = 0; i<users; i++){
            //System.out.println(patrons[i].returnName());
            patrons[i].showUsersInfo();
            System.out.printf("Your opening balance was %d\n", patrons[i].returnBalance());
            patrons[i].interest();
            System.out.println("____________________________________________________");
    }
   
    }
    
}
