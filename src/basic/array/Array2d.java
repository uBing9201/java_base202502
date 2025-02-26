package basic.array;

import java.util.Arrays;

public class Array2d {

    public static void main(String[] args) {

        // 일반적인 배열 작성
        int[] arr = new int[4];

        // 2차원 배열
        int[][] arr2d = new int[3][4];

        System.out.println("arr" + Arrays.toString(arr));
        System.out.println("arr2d" + Arrays.toString(arr2d));
        System.out.println("arr2d - dts" + Arrays.deepToString(arr2d));

        arr2d[1][1] = 100;

        System.out.println("arr2d - dts" + Arrays.deepToString(arr2d));

        int[][] score = {
                // 국, 영, 수
                {79, 80, 99}, // A학생
                {24, 73, 82}, // B학생
                {96, 89, 90}, // C학생
                {44, 63, 75}  // D학생
        };

        String[] stuName = {"A학생", "B학생", "C학생", "D학생"};
        String[] subName = {"국어", "영어", "수학"};

        /*
         1. 각 학생의 평균을 소수점 첫째 자리까지 출력해 보세요.
         2. 각 과목의 평균을 출력해 보세요.
         3. 반 평균을 출력해 보세요. (모든 학생들의 평균을 더해서 학생수로 나누기)
         */

        System.out.println("========================= 각 학생의 평균 =========================");

        double totalAvg = 0.0;
        int idx = 0; // stuName 배열에서 학생 이름을 지목할 용도.
        for (int[] stu : score) {
            int total = 0;
            for (int s : stu) {
                total += s;
            }
            double avg = (double)total / subName.length;
            totalAvg += avg;
            System.out.printf("%s의 평균: %.1f\n", stuName[idx], avg);
            idx++;
        }

        System.out.println("========================= 각 과목의 평균 =========================");

        /*   0     1     2
        0 - 0,0 | 1,1 | 2,0
        1 - 0,1 | 1,1 | 2,1
        2 - 0,2 | 1,2 | 2,2
        3 - 0,3 | 1,3 | 2,3
         */

        for (int i = 0; i < subName.length; i++) {
            int total = 0;
            for (int j = 0; j < stuName.length; j++) {
                total += score[j][i];
            }
            double avg = (double)total / stuName.length;
            System.out.printf("%s의 평균 점수: %.1f점 \n", subName[i], avg);
        }

        System.out.println("========================= 반 평균 =========================");

        double classAvg = totalAvg / stuName.length;
        System.out.printf("우리반 평균: %.1f점\n", classAvg);
    }

}
