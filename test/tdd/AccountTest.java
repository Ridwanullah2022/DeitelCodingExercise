package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {


    @Test
    public void depositTest(){
       // given
       Account bolaAccount = new Account();


       //when i deposit
        bolaAccount.deposit(5000);

         //check that balance is 5000
                int bolaAccountBalance = bolaAccount.getBalance();
                assertEquals(5000, bolaAccountBalance);

    }
    @Test
    public void depositNegativeAmountTest(){
        //given there is an account
        Account bolaAccount = new Account();
        //when i withdraw

    }

}
