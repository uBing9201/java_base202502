package oop.poly.player;

/*
    # 자식 클래스, 하위 클래스 (Child, Sub class)

    - 부모 클래스로부터 멤버변수(필드)와 메서드를 물려받는 클래스를
     자식 클래스라고 합니다.

    - 상속을 적용시키려면 자식 클래스 선언부의 클래스 이름 뒤에
     키워드 extends를 쓰고, 물려받을 부모 클래스의 이름을 적으시면 됩니다.
*/

public class Warrior extends Player {

    int rage; // 전사만이 가지는 속성

    public Warrior(String nickName) {
        // 모든 생성자에는 super()가 내장되어 있습니다.
        // 자식 객체가 생성될 때는 부모의 객체도 생성이 되어야
        // 부모의 속성과 기능이 실존하게 되고, 물려줄 수 있기 때문
        super(nickName);
        this.rage = 60;
    }
    @Override
    public void showStatus() {
        super.showStatus();
        System.out.println("# reag =  rage = " + rage);
    }
}
