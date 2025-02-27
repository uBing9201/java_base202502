package oop.modi.member.pac1;

public class B {

    void test() {
        A a1 = new A(50);       // public
        A a2 = new A(5.55);     // default
//        A a3 = new A(true); (x)  // private

        a1.f1 = 20;                 // public
        a1.f2 = 30;                 // default
//        a1.f3 = 40;               // private

        a1.m1();                    // public
        a1.m2();                    // default
//        a1.m3();                  // private
    }

}
