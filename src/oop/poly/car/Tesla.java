package oop.poly.car;

public class Tesla extends Car {

    @Override
    public void run() {
        System.out.println("Tesla is running");
    }

    public void activeAutoPilot() {
        System.out.println("테슬라의 오토파일럿을 가동합니다!");
    }
}
