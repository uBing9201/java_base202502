package oop.encap.good;

public class Main {

    public static void main(String[] args) {

        MyBirth my = new MyBirth();

//        my.day = 13; (x)

        my.setYear(1992);
        my.setMonth(2);
        my.setDay(30);

        my.birthInfo();
    }

}
