package com.allenwipf;

public class Main {

    public static void main(String[] args) {

        Account allen = new Account(1, 2000.00, "Allen Wpf",
                "allenwipf@msn.com", "(970) 381-0053");

        Account empty = new Account();

        allen.withdraw(2000.00);
        System.out.println("Thanks for your business " + allen.getName());
        System.out.println(empty.getName() + " Your balance is " + empty.getBalance());

        VipCustomer allenVip = new VipCustomer();
        System.out.println(allenVip.getName());
        System.out.println(allenVip.getLimit());
        System.out.println(allenVip.getEmail());
    }

}
