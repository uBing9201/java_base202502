package oop.inherit.test;

public class ElectronicProduct {

    // 제품명
    String productName;
    // 가격
    double price;
    // 제조사
    String manufacturer;

    public ElectronicProduct(String productName, double price, String manufacturer) {
        this.productName = productName;
        this.price = price;
        this.manufacturer = manufacturer;
    }

    public void displayInfo() {
        System.out.printf("%s, price: %.0f원, 제조사: %s",  this.productName, this.price, this.manufacturer);
    }
}
