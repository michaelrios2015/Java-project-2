/*
Michael Rios
COSC 600
Project 2
Algorithm:

Read Data

Find out which type of account user has

Place data in an array of accounts objects 

calculate interset on account

display infoprmation

Purpose: take in user information, determine account type, calulate interset earned


 */

package project2;


public class Driver {//short and sweet

    public static void main(String[] args) {
    
    Miscellenous MyMisc = new Miscellenous();     
        
    int users = MyMisc.numberOfUsers();
   
    accounts[] patrons;    
    
    patrons = MyMisc.fillArray(users);

    MyMisc.output(users, patrons);
 
// TODO code application logic here
    }
    
}
