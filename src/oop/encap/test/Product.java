package oop.encap.test;

public class Product {

    // 제품 이름
    private String name;
    // 가격
    private int price;
    // 재고수량
    private int stock;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void reduceStock(int quantity) {
        if(quantity < 0 || this.stock < quantity) {
            System.out.println("요청한 수량이 재고보다 많거나, 잘못된 수량 입니다.");
            return;
        }
        this.stock -= stock;
    }

}
