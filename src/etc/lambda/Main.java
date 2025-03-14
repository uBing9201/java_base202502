package etc.lambda;

import java.util.List;

// static 필드나 메서드를 클래스 이름 없이 호출하기 위한 import
import static etc.lambda.Color.*;
import static etc.lambda.FilterApple.*;

public class Main {

    public static void main(String[] args) {
        // 사과 바구니 생성
        List<Apple> appleBasket = List.of(
                new Apple(80, GREEN)
                , new Apple(155, GREEN)
                , new Apple(120, RED)
                , new Apple(97, RED)
                , new Apple(200, GREEN)
                , new Apple(50, RED)
                , new Apple(85, YELLOW)
                , new Apple(75, YELLOW)
        );

        System.out.println("-------------- 녹색 사과만 필터 --------------");
        List<Apple> filterApple = filterGreenApples(appleBasket);
        for (Apple greenApple : filterApple) {
            System.out.println(greenApple);
        }

        System.out.println("-------------- 색상에 따른 사과필터 --------------");
        List<Apple> filterApple2 = filterAppleByColor(appleBasket, RED);
        for (Apple greenApple : filterApple2) {
            System.out.println(greenApple);
        }

        System.out.println("-------------- 무게가 100이하 사과필터 --------------");
        List<Apple> filterApple3 = filterApple(appleBasket, new LightApplePredicate());
        for (Apple greenApple : filterApple3) {
            System.out.println(greenApple);
        }

        System.out.println("-------------- 빨강, 노랑 사과필터 --------------");
        // 빨강 또는 노랑 삭롸만 필터링
        // 그럼 클래스 또 만들건가!? Light Apple Predicate 처럼 ? ...?
        // 메서드 선언할 때 이름 없는 클래스 즉석에서 선언해서 보내주면 안된다!? -? 익명 클래스
        List<Apple> filterApple4 = filterApple(appleBasket, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return apple.getColor() == RED || apple.getColor() == YELLOW;
            }
        });
        filterApple4.forEach(System.out::println);

        System.out.println("-------------- 녹색이며 100g 이하인 사과필터 --------------");
        // 녹색이면서 100g 이아인 사과만 필터링
        // 우리는 이제 익명클래스를 통해, 새 클래스 파일 생성 없이 즉성에서 보낼 수 있음!
        // 근데... 생각해보니, 어짜피 인터페이스에 추상메서드 하나 아닌가?
        // 그럼 이름을 굳이 언급할 필요가 있나? -> 람다식으로 작성한다면 ?
        List<Apple> filterApple5 = filterApple(
                appleBasket,
                (apple -> apple.getColor() == GREEN && apple.getWeight() <= 100)
        );
        filterApple5.forEach(System.out::println);

        System.out.println("-------------- 색이 빨강 혹은 초록이며 무게는 150g 미만인 사과필터 --------------");
        List<Apple> filterApple6 = filterApple(
                appleBasket,
                (apple -> (apple.getColor() == GREEN || apple.getColor() == RED)
                        && apple.getWeight() < 150)
        );
        filterApple6.forEach(System.out::println);

        System.out.println("-------------- 여러가지 타입의 객체를 필터링 --------------");
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> filter1 = filter(numbers, n -> n % 2 == 0);
        filter1.forEach(System.out::println);

    }

}
