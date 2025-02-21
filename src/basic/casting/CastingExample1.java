package basic.casting;

public class CastingExample1 {

    public static void main(String[] args) {

        /*
         - 크기가 작은 데이터 타입의 자료를 큰 데이터 타입으로 변환할 때는
          자바 가상 머신 (JVM)이 자동으로 타입을 올려서 변환해 줍니다.
          (promotion, UpCasting)
        */

        byte b = 10;
        int i = b; // byte -> int로 자동 변환 후 대입 연산 진행
        System.out.println("i " + i);
        byte b1 = (byte) i; // 강제형변환
        System.out.println("b1 = " + b1);

        
        char c = '가';
        int j = c; // char -> int로 변환
        System.out.println("j " + j);
        char c1 = (char) j; // 강제형변환
        System.out.println("c1 " + c1);
        
        
        int k = 500;
        double d = k; // int -> double 변환
        System.out.println("d = " + d);
        int k1 = (int) d; // 강제형변환
        System.out.println("k1 = " + k1);

    }
}
