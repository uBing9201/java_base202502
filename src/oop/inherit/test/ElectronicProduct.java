package oop.inherit.test;

public class ElectronicProduct {

    // 제품명
    String productName;
    // 가격
    int price;
    // 제조사
    String manufacturer;

    public ElectronicProduct(String productName, int price, String manufacturer) {
        this.productName = productName;
        this.price = price;
        this.manufacturer = manufacturer;
    }

    public void displayInfo() {
        System.out.printf("%s, price: %d원, 제조사: %s",  productName, price, manufacturer);
    }
}
