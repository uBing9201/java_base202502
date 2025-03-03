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

    public void reduceStock(int stock) {
        if(this.stock >= stock) {
            this.stock -= stock;
        }else{
            System.out.println("재고수량 적은개수로 들어올때만 작동");
        }
    }

}
