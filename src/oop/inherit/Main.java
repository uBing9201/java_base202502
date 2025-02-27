package oop.inherit;

public class Main {

    public static void main(String[] args) {

        Warrior w1 = new Warrior("전사...");

        w1.showStatus();

        Mage m1 = new Mage("법사...");
        m1.showStatus();
    }
}
