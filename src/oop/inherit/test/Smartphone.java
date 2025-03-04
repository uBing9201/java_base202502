package oop.inherit.test;

public class Smartphone extends ElectronicProduct {

    // 저장 용량
    int storageCapacity;

    public Smartphone(String productName, double price, String manufacturer, int storageCapacity) {
        super(productName, price, manufacturer);
        this.storageCapacity = storageCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf("\n저장 용량: %d GB", this.storageCapacity);
    }
}
