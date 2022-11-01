package com.vti.backend;

import com.vti.entity.Account;

public class Ex2 {
    public static void main(String[] args) {
        Ex2 ex2 = new Ex2();
        ex2.ques__xx();
    }

    public void ques1(){
        Account[] accounts = new Account[3];

        for (int i = 0; i < accounts.length; i++) {
            Account account = new Account();
            account.email = "email " + (i +1);
            account.userName = "us " + (i +1);
            accounts[i] = account;
            System.out.println(accounts[i]);
        }
    }

    public void ques__xx(){
        Account account = new Account();
        account.userName = "Test";
        System.out.println(account);
    }
}
