package basic.operator;

public class UnaryOperator {

    public static void main(String[] args) {

        // 증감 연산자 (++, --)
        // 변수의 값을 단순히 하나 올리거나 내릴 때 사용
        int i = 1;
//        int j = i++; // 후위 연산 (선연산 후증감)
//        int k = i--;
        int j = ++i; // 전위 연산 (선증감 후연산)
        int k = --i;
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);

        int num1 = 7, num2 = 7;
        int result1 = --num1 + 4;
        int result2 = num2-- + 4;
        System.out.println(result1);
        System.out.println(result2);
    }

}
