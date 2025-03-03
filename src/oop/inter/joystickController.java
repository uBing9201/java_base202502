package oop.inter;

// 인터페이스를 구현하는 구현체 클래스는 반드시 모든 추상 메서드를 재정의 해야 한다.
// 인터페이스는 상속과 달리 단일이아닌 동시 다중구현이 가능하다
public class joystickController implements GameController, Vibration, AdvancedController {

    @Override
    public void moveCharacter(String direction) {
        System.out.println("조이스틱 " + direction + "키를 눌러 캐릭터 이동");
    }

    @Override
    public void action() {
        System.out.println("조이스틱 A 버튼을 눌러 행동 수행");
    }

    @Override
    public void pause() {
        System.out.println("조이스틱 start 버튼을 눌러 게임 일시 정지");
    }

    @Override
    public void vibrate(int intensity) {
        System.out.println(intensity + "강도로 진동 조정");
    }

    @Override
    public void offVibrate() {
        System.out.println("진동이 꺼집니다.");
    }


    @Override
    public void specialAction() {

    }

    @Override
    public void customizeButton(String config) {

    }
}
