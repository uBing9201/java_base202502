package oop.static_.test;

public class Store {

    // 총 판매액
    private static int totalSales;

    public static void addSale(int amount) {
        totalSales += amount;
    }

    public static int getTotalSales() {
        return totalSales;
    }
}
