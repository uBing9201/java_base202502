package oop.inter;

// 인터페이스들끼리 상속이 가능하다. (다중 상속도 가능)
// 클래스는 단일상속만 가능 - 인터페이스끼리는 다중상속이 가능
public interface AdvancedController extends GameController{

    void specialAction();
    void customizeButton(String config);

}
