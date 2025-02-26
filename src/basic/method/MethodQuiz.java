package basic.method;

import java.util.Arrays;

public class MethodQuiz {

    static String[] foods = {"chicken", "pasta", "beef"};

    // 배열 내부 한눈에 보기
    static void printFoods() {
        System.out.println(Arrays.toString(foods));
    }

    // foods 배열에서 특정 데이터의 인덱스를 반환
    // 메서드 이름: indexOf, 매개변수: 음식이름(String)
    static int indexOf(String searchFood) {
        for (int i = 0; i < foods.length; i++) {
            if (searchFood.equals(foods[i])) {
                return i;
            }
        }
        return -1;
    }

    // 특정 요소가 배열에 포함되어 있는지의 여부를 확인하는 메서드를 작성하세요.
    // static boolean isInclude(String searchTarget)
    static boolean isInclude(String searchTarget) {

        int i = 0;

        while (i < foods.length) {
            if(foods[i].equals(searchTarget)) {
                return true;
            }
            i++;
        }

        return false;
    }

    // foods 배열에 데이터를 끝에 추가하는 메서드를 작성하세요.
    // static void push(String newFood)
    static void push(String newFood) {
        String[] newFoods = new String[foods.length + 1];
        for (int i = 0; i < foods.length; i++) {
            newFoods[i] = foods[i];
        }
        newFoods[foods.length] = newFood;
        foods = newFoods;
    }

    // 특정 인덱스가 범위 내의 올바른 인덱스인지를 확인하는 메서드를 작성하세요.
    // static boolean isOutOfBounds(int targetIndex)
    // 작성이 완료되면 타 메서드에서 활용할 수 있을 것입니다.
    static boolean isOutOfBounds(int targetIndex) {
        return targetIndex < 0 || targetIndex >= foods.length;
    }

    // 원하는 인덱스 위치에 요소를 삽입하는 메서드를 작성하세요.
    // static void insert(int targetIndex, String newFoodName)
    // targetIndex는 기존 foods의 배열 인덱스 범위 내여야 합니다.
    static void insert(int targetIndex, String newFoodName) {
        if (isOutOfBounds(targetIndex)) {
            System.out.println("배열 인덱스범위가 아닙니다.");
            return;
        }
        String[] newFoods = new String[foods.length + 1];
        for(int i = 0, j = 0; i < newFoods.length; i++) {
            if(i == targetIndex) {
                newFoods[i] = newFoodName;
            }else{
                newFoods[i] = foods[j++];
            }
        }
        foods = newFoods;
    }

    // 원하는 인덱스 위치의 요소를 수정하는 메서드를 작성하세요.
    // void modify(int targetIndex, String newFoodName)
    // targetIndex는 기존 foods의 배열 인덱스 범위 내여야 합니다.
    static void modify(int targetIndex, String newFoodName) {
        if (isOutOfBounds(targetIndex)) {
            System.out.println("배열 인덱스 범위가 아닙니다.");
            return;
        }
        foods[targetIndex] = newFoodName;
    }

    // 특정 인덱스의 요소를 삭제하는 메서드를 작성하세요.
    // void remove(String deleteTarget)
    static void remove(String deleteTarget) {
        int idx = indexOf(deleteTarget);
        if (idx == -1) {
            System.out.println("해당 음식이 존재하지 않습니다.");
            return;
        }
        String[] newFoods = new String[foods.length - 1];
        for (int i = 0, j = 0; i < foods.length; i++) {
            if (i != idx) {
                newFoods[j++] = foods[i];
            }
        }
        foods = newFoods;
    }

    // 배열 내부를 깔끔하게 비워버리는 메서드를 작성하세요. (삭제 반복 x)
    // void clear()
    static void clear() {
        foods= new String[0];
    }


    public static void main(String[] args) {

//        printFoods();
//        int idx = indexOf("apple");
//        System.out.println("idx = " + idx);

        printFoods();
        push("pizza");
        printFoods();
        insert(1, "sushi");
        printFoods();
        modify(2, "burger");
        printFoods();
        remove("pasta");
        printFoods();
        clear();
        printFoods();

    }

}