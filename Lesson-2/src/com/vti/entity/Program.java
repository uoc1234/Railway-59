package com.vti.entity;

public class Program {
    public static void main(String[] args) {
        Group group = new Group();
        Account[] accounts = {new Account(), new Account()};

        group.accounts = accounts;

        for (Account account: group.accounts) {
            System.out.println(account.fullName);
            System.out.println(account.email);
        }

        for (int i = 0; i < group.accounts.length -1; i++) {
            Account account = group.accounts[i];
            System.out.println(account.fullName);
            System.out.println(account.email);
        }
        int i = 0;
        while (i < group.accounts.length){
            System.out.println(group.accounts[i].fullName);
            i++;
        }

        do {
            System.out.println(group.accounts[i].fullName);
            i++;
        } while (i < group.accounts.length);

    }
}
