package oop.encap.test;

public class BankAccount {

    // 계좌 잔액
    private long balance;
    // 계좌 번호
    private String accountNumber;
    // 계좌 주인의 이름
    private String accountHolder;

    // 생성자
    public BankAccount(String accountHolder, String accountNumber, long balance) {
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
    }

    // 잔액 조회
    public long getBalance() {
        return this.balance;
    }

    // 입금
    public void deposit(long money) {
        if(money < 0) {
            System.out.println("입금액이 올바르지 않습니다.");
            return;
        }
        this.balance += money;
    }

    // 출금
    public void withdraw(long money) {
        if(money < 0 || money > this.balance) {
            System.out.println("잔액이 부족하거나 잘못된 출금액 입니다.");
            return;
        }
        this.balance -= balance;
    }
}
