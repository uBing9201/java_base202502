package oop.encap.test;

public class Car {

    // 자동차 브랜드
    private String brand;
    // 모델
    private String model;
    // 연식
    private int year;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if(year < 1900 || year > 2025) {
            System.out.println("잘못된 연도 입력입니다.");
            return;
        }
        this.year = year;
    }
}
