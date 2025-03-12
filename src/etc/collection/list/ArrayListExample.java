package etc.collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class ArrayListExample {

    public static void main(String[] args) {

        /*
             # ArrayList
             - 배열과 다르게 크기가 자동으로 조절되는 자료구조 클래스.
             - 배열과 유사한 형태이기 때문에 순차적으로 데이터에 접근하기가 좋다.
             - 인덱스를 활용하며, 객체의 중복 저장을 허용한다.
         */

        // <> -> 제네릭 (타입의 형식을 지정하여 타입 안정성을 꾀하기 위한 문법)
        List<String> nick = new ArrayList<>();

        // add(객체): 리스트에 객체를 추가하는 메서드
        nick.add("멍멍이");
        String str = "야옹이";
        nick.add(str);
        nick.add(new String("개구리"));
        nick.add("짹짹이");
        nick.add("야옹이");

        System.out.println("nick = " + nick);
        
        // add(인덱스, 객체): 웒는 위치에 객체 삽입
        nick.add(3, "어흥이");

        System.out.println("nick = " + nick);

        // get(인덱스): 리스트 내부의 객체를 참조
        // String str = nick[3];
        String name = nick.get(3);
        System.out.println("name = " + name);
        System.out.println("nick.size() = " + nick.size());
        
        // set(인덱스, 수정할 객체): 리스트 내부의 객체를 수정
        nick.set(2, "삐약이");
        System.out.println("nick = " + nick);

        // 리스트 반복문 처리
        for (int i = 0; i < nick.size(); i++) {
            System.out.println(nick.get(i));
        }

        System.out.println("----------------------------------------------");

        for(String n : nick) {
            System.out.println(n);
        }

        System.out.println("----------------------------------------------");

        // contains(객체): 리스트 내의 객체의 존재 유무를 파악
        System.out.println(nick.contains("삐약이"));
        System.out.println(nick.contains("메뚜기"));

        System.out.println("----------------------------------------------");

        // indexOf(객체): 특정 객체의 인덱스 탐색, 없으면 -1 리턴
        int idx = nick.indexOf("개구리");
        System.out.println("idx = " + idx);

        idx = nick.indexOf("삐약이");
        System.out.println("idx = " + idx);

        System.out.println("----------------------------------------------");

        // remove(객체 or 인덱스): 리스트 내부 객체 삭제
        System.out.println("nick = " + nick);
        nick.remove("삐약이");
        nick.remove(0);
        System.out.println("nick = " + nick);

        System.out.println("----------------------------------------------");
        
        // clear(): 리스트 내부요소 전체 삭제
        nick.clear();
        System.out.println("nick = " + nick);

        System.out.println("----------------------------------------------");

        // isEmpty(): 리스트가 비어있는지의 여부 확인
        System.out.println(nick.isEmpty());

        System.out.println("----------------------------------------------");

        /*
         # 컬렉션 객체들은 Colletions의 기능을 사용할 수 있다.
           Collections 는 컬렉션 객체들의 부가 기능들을 제공한다.
         */
        List<Integer> score = new ArrayList<>();
        score.add(65);

        // 리스트 생성과 동시에 초기화하기
        // asList를 통해 리턴받은 리스트는 삽입/삭제가 불가능하다.(고정된 크기를 가짐)
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        // list.add(11); (x) 삽입 삭제가 안된다. 기능은 다 제공되지만 배열처럼 생성이 됨
        System.out.println("list = " + list);


        // 한번에 객체 많이 추가하기
        Collections.addAll(score, 78, 100, 88, 79, 100, 21, 56, 100);

        System.out.println("score = " + score);

        // 컬렉션으로 중복값 구하기
        System.out.println(Collections.frequency(list, 100));

        // 최대값, 최소값
        System.out.println("최대값: " + Collections.min(score));
        System.out.println("최소값: " + Collections.max(score));

        // 정렬
//        Collections.sort(score);
//        System.out.println("score = " + score);
//
//        Collections.reverse(score);
//        System.out.println("score = " + score);

//        Collections.sort(score, Collections.reverseOrder());
        score.sort(Collections.reverseOrder());
        System.out.println("score = " + score);

        // 두 요소의 위치를 교체 swap(리스트, i, j)
        Collections.swap(score, 3, 7);
        System.out.println("score = " + score);
        
        // 리스트 내의 요소를 무작위로 섞기
        Collections.shuffle(score);
        System.out.println("score = " + score);

        // 원하는 객체로 컬렉션을 전부 초기화
        Collections.fill(score, 100);
        System.out.println("score = " + score);


    }

}
