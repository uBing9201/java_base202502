package basic.array;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class ArraySearch {

    public static void main(String[] args) {

        String[] foods = {"피자", "파스타", "치킨", "삼겹살"};

        Scanner sc = new Scanner(System.in);
        System.out.print("찾고싶은 음식을 입력하세요: ");
        String name = sc.nextLine();

        boolean flag = false;
        for (int i = 0; i < foods.length; i++) {
            if (name.equals(foods[i])) {
                System.out.println("탐색 완료!");
                System.out.println("인덱스: " + i + "번");
                flag = true;
                break;
            }

            if(i == foods.length - 1){
                System.out.println("없는 음식입니다.");
            }
        }

        if (!flag) {
            System.out.println("없는 음식입니다.");
        }

        sc.close();

    }

}
