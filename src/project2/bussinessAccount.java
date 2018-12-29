/*
Michael Rios
COSC 600
Project 2
 */

package project2;

public class bussinessAccount extends accounts{

    //constructor
    public bussinessAccount(String name1, int account1, String phoneNumber1, String SSN1, int balance1, char type1) {
        super(name1, account1, phoneNumber1, SSN1, balance1, type1);
    }
    
    
    public void interest(){//business accounts do not earn interest, so we just print that 

    System.out.printf("your closing balance is %d, Sorry no interest is earned on Bussiness Accounts\n", balance);
}

}
