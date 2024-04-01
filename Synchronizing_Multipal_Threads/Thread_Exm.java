package Synchronizing_Multipal_Threads;

import javax.script.ScriptContext;
import java.util.Scanner;
import java.util.SortedMap;

class Account {
    private int bal;

    public Account(int bal) {
        this.bal = bal;
    }

    public boolean isSufficientBalance(int W) {
        if (bal > W)
            return (true);
        else
            return (false);

    }

    public void withdraw(int amt) {
        bal = bal - amt;
        System.out.println("Withdrawl money is " + amt);
        System.out.println("Your current balance is " + bal);
    }
}

class Customer implements Runnable {
    private String name;
    private final Account account;

    public Customer(Account account, String n) {
        this.account = account;
        name = n;
    }

    public void run() {
        Scanner KB = new Scanner(System.in);

        synchronized (account) {
            System.out.println(name + ",Enter amount to withdraw");
            int amt = KB.nextInt();
            if (account.isSufficientBalance(amt)) {
                System.out.println(name);
                account.withdraw(amt);

            } else
                System.out.println("Insufficient Balance");
        }
    }
}

public class Thread_Exm {
    public static void main(String[] args) {
        Account a1 = new Account(1000);
        Customer c1 = new Customer(a1, "Raj"), c2 = new Customer(a1, "simian");
        Thread t1 = new Thread(c1);

        Thread t2 = new Thread(c2);
        t1.start();
        t2.start();
    }
}
