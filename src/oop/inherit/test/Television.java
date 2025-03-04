package oop.inherit.test;

public class Television extends ElectronicProduct {

    int screenSize;

    public Television(String productName, double price, String manufacturer, int screenSize) {
        super(productName, price, manufacturer);
        this.screenSize = screenSize;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf("\nScreen Size: %d inches", this.screenSize);
    }
}
