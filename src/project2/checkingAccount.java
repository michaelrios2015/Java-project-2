/*
Michael Rios
COSC 600
Project 2
 */

package project2;

public class checkingAccount extends accounts{

    //constructor
    public checkingAccount(String name1, int account1, String phoneNumber1, String SSN1, int balance1, char type1) {
        super(name1, account1, phoneNumber1, SSN1, balance1, type1);
    }

    public void interest(){

    float close = (float) (balance *(1 + .025/12));//this assumes the 2.5% interest is yearly so they only earn 1/12 every month   
    System.out.printf("Your closing balance is $%1$1.2f. You Earn 2.5%% yearly interest on your checking account\n", close);
}

}
