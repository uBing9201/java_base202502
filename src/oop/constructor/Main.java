package oop.constructor;

public class Main {

    public static void main(String[] args) {

        System.out.println("====================");

        Phone phone2 = new Phone();
        phone2.model = "폴더폰";
        phone2.color = "회색";
        phone2.price = 200000;
        phone2.showSpec();

        System.out.println("====================");

        Phone galaxy = new Phone("갤럭시 s25");
        galaxy.showSpec();

        System.out.println("====================");

        Phone iPhone = new Phone("아이폰 16", "스페이스그레이");
        iPhone.showSpec();
    }

}
