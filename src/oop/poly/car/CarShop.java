package oop.poly.car;

public class CarShop {

    /*
        Mammals
           |
         Person
           |
        Student

        Mammals m = new Student();
        m instanceof Person -> ture
     */

    public void carPrice(Car car) {
        if (car instanceof Sonata) {
            System.out.println("소나타의 가격은 3천만원 입니다.");
        } else if (car instanceof Tesla) {
            System.out.println("테슬라의 가격은 8천만원 입니다.");
        } else if (car instanceof Porsche) {
            System.out.println("포르쉐의 가격은 1.5억 입니다.");
        }
    }

}
