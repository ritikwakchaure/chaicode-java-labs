package com.chaicode.whileloop;

/**
 * CityBank ATM Withdrawal
 *
 * <p>An ATM dispenses $20 bills only. Given the account balance and requested amount,
 * return how many $20 bills can actually be dispensed.
 *
 * <p>Rules:
 * <ul>
 *   <li>Repeatedly subtract 20 while balance allows and requested amount still needs bills</li>
 *   <li>If requested amount is not a multiple of 20, return -1</li>
 *   <li>If balance or requested amount is negative, return -1</li>
 *   <li>Account must keep at least $20 after each bill is dispensed</li>
 * </ul>
 *
 * @param balance account balance in dollars
 * @param requested amount requested in dollars
 * @return number of $20 bills dispensed, or -1 for invalid request
 */
public final class ATMWithdrawal {

    private ATMWithdrawal() {}

    public static int dispenseBills(int balance, int requested) {
        // Your code here
        if(balance < 0 || requested < 0|| requested % 20 !=0){
            return -1;

        }
        int bill = 0;

        while (requested >= 20 && balance-20>=20){
            balance -=20;
            requested-=20;
             bill++;
        }


        return bill;
    }

    public static void main(String[] args) {

        System.out.println(dispenseBills(200, 100)); // 5
        System.out.println(dispenseBills(80, 80));   // 3
        System.out.println(dispenseBills(40, 40));   // 1
        System.out.println(dispenseBills(50, 30));   // -1
        System.out.println(dispenseBills(-10, 40));  // -1
        System.out.println(dispenseBills(100, 90));  // -1
    }

}
