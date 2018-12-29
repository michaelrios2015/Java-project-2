/*
Michael Rios
COSC 600
Project 2
 */

package project2;

public class savingsAccount extends accounts{
 
    //constructor
    public savingsAccount(String name1, int account1, String phoneNumber1, String SSN1, int balance1, char type1) {
        super(name1, account1, phoneNumber1, SSN1, balance1, type1);
    }
    
    public void interest(){
    if (balance < 5000){
        float close = (float) (balance *(1+.04/12));//this assumes the 4% interest is yearly so they only earn 1/12 every month    
        //System.out.printf("Your closing balance is %f\n", close);
        System.out.printf("Your closing balance is $%1$1.2f. You Earn 4%% yearly interest on your Savings account\n", close);
    }     
    else{
        float close = (float) (balance *(1 +.05/12));//this assumes the 5% interest is yearly so they only earn 1/12 every month    
        //System.out.printf("Your closing balance is %f\n", close);
        System.out.printf("Your closing balance is $%1$1.2f. You Earn 5%% yearly interest on your Savings account\n", close);
    }
} 
   
}
