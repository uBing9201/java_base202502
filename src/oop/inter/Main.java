package oop.inter;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // 인터페이스와 구현체 간에도 다형성 발생이 가능하다.
        GameController gc;

        Scanner sc = new Scanner(System.in);
        System.out.println("게임을 플레이 할 도구를 선택하세요.");
        System.out.println("1. 키보드 | 2. 조이스틱 | 3. 터치스크린");
        System.out.print("> ");

        int menu = sc.nextInt();

        if (menu == 1) {
            gc = new KeyboardController();
        } else if (menu == 2) {
            gc = new joystickController();
        } else {
            gc = new touchScreenController();
        }

        gc.moveCharacter("🔼");
        gc.action();
        gc.pause();

    }

}
