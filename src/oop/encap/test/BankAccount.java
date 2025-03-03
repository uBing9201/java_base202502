package oop.encap.test;

public class BankAccount {

    // 계좌 잔액
    private int balance;
    // 계좌 번호
    private String accountNumber;
    // 계좌 주인의 이름
    private String accountHolder;

    // 잔액 조회
    public int getBalance() {
        return this.balance;
    }

    // 입금
    public int deposit(int balance) {
        return this.balance += balance;
    }

    // 출금
    public int withdraw(int balance) {
        return this.balance -= balance;
    }

    public BankAccount(String accountHolder, String accountNumber, int balance) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
    }
}
