package etc.generic.bad;

public class Main {

    public static void main(String[] args) {

        /*
         Object타입으로 선언하면 무엇이든 저장할 수는 있지만
         반대로 저장했던 값을 꺼내올 때는 타입별로 일일히 형변환을 해야하는
         문제가 발생합니다.
         잘못 형 변환 했을 시에는 예외가 발생할 수도 있습니다.
         */

        Box box = new Box();

        box.setObj("김춘식");
        Object obj = box.getObj();
        // System.out.println(((Integer)obj).charAt(1)); -- 에러

        Box p = new Box();
        p.setObj(new Person());
        System.out.println(((Person)p.getObj()).getName());
    }

}
