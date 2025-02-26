package basic.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayQuiz02 {

    public static void main(String[] args) {

        /*
		 1. 삭제할 친구를 입력받아서 삭제를 진행해 주세요.

		 2. 입력받은 이름이 없다면 없다고 얘기해 주세요.

		 - 추가
		 배열의 길이가 0이 될 때까지 삭제를 반복해 보세요.
		 더 이상 지울 친구가 없다면 프로그램 종료.
		 */

//        Scanner sc = new Scanner(System.in); // 사용자 입력을 받기 위한 Scanner 객체 생성
//        String[] names = {"친구1", "친구2", "친구3"}; // 삭제할 친구 목록 (배열)
//
//        // 배열에 친구가 남아 있는 동안 반복
//        while (names.length > 0) {
//            System.out.print("삭제할 친구 이름 입력: ");
//            String deleteName = sc.nextLine(); // 사용자가 입력한 삭제할 친구 이름 저장
//            boolean found = false; // 삭제할 친구가 존재하는지 여부를 확인하는 변수
//
//            // 배열을 순회하며 삭제할 친구 찾기
//            for (int i = 0; i < names.length; i++) {
//                if (deleteName.equals(names[i])) { // 입력한 이름이 배열의 요소와 일치하면
//                    found = true; // 친구를 찾았음을 표시
//
//                    // 현재 배열보다 길이가 1 작은 새 배열 생성 (삭제된 요소 제외)
//                    String[] temp = new String[names.length - 1];
//
//                    // 기존 배열에서 삭제할 친구를 제외하고 새 배열로 복사
//                    for (int j = 0, k = 0; j < names.length; j++) {
//                        if (j != i) { // 삭제할 인덱스가 아닐 때만 새로운 배열에 추가
//                            temp[k++] = names[j];
//                        }
//                    }
//
//                    names = temp; // 새 배열을 기존 배열로 변경
//                    break;
//                }
//            }
//
//            // 삭제할 친구가 없을 경우 메시지 출력
//            if (!found) {
//                System.out.println("해당 친구가 없습니다.");
//            }
//
//            // 현재 남아 있는 친구 목록 출력
//            System.out.println("현재 친구 목록: " + Arrays.toString(names));
//        }
//
//        System.out.println("더 이상 지울 친구가 없습니다. 프로그램 종료.");
//        sc.close();

        System.out.println("=========== 해설 ===========");

        Scanner sc = new Scanner(System.in);
        String[] kakao = {"무지", "네오", "어피치", "라이언", "제이지"};
        System.out.println("현재 저장된 친구들: " + Arrays.toString(kakao));

        while (kakao.length > 0) {

//            if (kakao.length == 0) {
//                System.out.println("더 이상 삭제할 친구가 없네요.");
//                System.out.println("프로그램을 종료합니다.");
//                break;
//            }

            System.out.print("삭제하고 싶은 친구를 입력하세요: ");
            String name = sc.next();

            boolean flag = false;

            for (int i = 0; i < kakao.length; i++) {
                if (name.equals(kakao[i])) {
                    flag = true;
                    for (int j = i; j < kakao.length - 1; j++) {
                        kakao[j] = kakao[j + 1];
                    }
                    break;
                }
            }

            if (!flag) {
                System.out.println(name + "은(는) 없는 이름입니다.");
            } else {
                String[] temp = new String[kakao.length - 1];
                for (int k = 0; k < temp.length; k++) {
                    temp[k] = kakao[k];
                }
                kakao = temp;
                temp = null;

                System.out.println("삭제 후 정보: " + Arrays.toString(kakao));
            }
        }

        System.out.println("더 이상 삭제할 친구가 없네요.");
        System.out.println("프로그램을 종료합니다.");

        sc.close();
    }
}