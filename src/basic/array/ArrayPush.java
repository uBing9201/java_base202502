package basic.array;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayPush {

    public static void main(String[] args) {

        ArrayList<String> stringList = new ArrayList<>();

        stringList.add("a");

        // push: 배열의 맨 끝에 데이터를 추가.
        int[] numbers = {10, 20, 30, 40};
        int nuwNumber = 50;

        // 1. 기존 사이즈보다 1개 큰 새로운 배열 선언
        int[] temp = new int[numbers.length + 1];

        // 2. 기존 데이터를 새로운 배열에 그대로 목사
        for (int i = 0; i < numbers.length; i++) {
            temp[i] = numbers[i];
        }

        // 3. temp 배열의 끝 인덱스에 넣을 데이터 추가
        temp[temp.length - 1] = nuwNumber;

        // 4. 주소값 이전 (temp는 더이상 새 배열에 관여하지 않게 하기!)
        numbers = temp;
        temp = null;

        System.out.println(Arrays.toString(numbers));
    }

}
