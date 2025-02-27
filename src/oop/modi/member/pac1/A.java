package oop.modi.member.pac1;

/*
 - public:      어디서든 사용이 가능하다
 - protected:
 - default:     같은 패키지 내에서만 사용이 가능하다
 - private:     같은 클래스 내에서만 사용이 가능하다
 */

public class A {

    // 필드
    public int f1;          // public
    int f2;                 // default
    private int f3;         // private

    // 생성자
    public A(int a) {}      // pulbic
    A(double b) {}          // default
    private A(boolean c) {} // private

    // 메서드
    public void m1(){}
    void m2(){}             // default
    private void m3(){}

    void test() {
        this.f1 = 10;       // public
        this.f2 = 20;       // default
        this.f3 = 30;       // private

        this.m1();          // public
        this.m2();          // default
        this.m3();          // private

        new A(10);      // public
        new A(3.14);    // default
        new A(false);   // private
    }
}
