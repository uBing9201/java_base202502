package basic.loop;

import java.util.Scanner;

public class ForExample {

    public static void main(String[] args) {

        /*
        int j = 1; // begin
        int total = 0; // 누적합을 기억시킬 변수
        while(j <= 10) { // end
            total += j;
            j++; // step
        }
        System.out.println(total);
        */

        int total = 0;
        for(int j=1; j<=10; j++) {
            total += j;
        }
        System.out.println(total);

        // 1 ~ 200 까지의 정수 중 6의 배수이면서 12의 배수는 아닌 수를 가로로 출력
        System.out.println("\n1 ~ 200 까지의 정수 중 6의 배수이면서 12의 배수는 아닌 수를 가로로 출력");
        for (int i = 0; i <= 200; i++) {
            if(i % 6 == 0 && i % 12 != 0) {
                System.out.print(i + " ");
            }
        }

        // 정수를 하나 입력받아서 입력받은은 정수까지의 팩토리얼 값을 구하세요.
        // 팩토리얼) 5! -> 5 x 4 x 3 x 2 x 1
        System.out.println("\n정수를 하나 입력받아서 입력받은 정수까지의 팩토리얼 값을 구하세요.");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int f = 1;
        for(int j=1; j<=num; j++) {
            f *= j;
        }
        System.out.println(f);

        sc.close();

    }

}
