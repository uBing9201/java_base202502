package basic.loop;

public class WhileExample2 {

    public static void main(String[] args) {

        System.out.println("48 ~ 150 사이의 정수 중 8의 배수만 가로로 출력해 보세요.");
        // 48 ~ 150 사이의 정수 중 8의 배수만 가로로 출력해 보세요.
        int i = 48;
        while(i <= 150) {
            if(i % 8 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }

        System.out.println("\n\n1 ~ 100 까지의 정수중 4의 배수이면서 8의 배수는 아닌 수를 가로로 출력해 보세요.");
        // 1 ~ 100 까지의 정수중 4의 배수이면서
        // 8의 배수는 아닌 수를 가로로 출력해 보세요.
        int j = 1;
        while( j <= 100) {
            if(j % 4 == 0 && j % 8 != 0) {
                System.out.print(j + " ");
            }
            j++;
        }

        System.out.println("\n\n1 ~ 30000 까지의 정수 중 258의 배수의 개수를 출력");
        // 1 ~ 30000 까지의 정수 중 258의 배수의 개수를 출력
        int x = 1;
        int cnt = 0;
        while( x <= 30000 ) {
            if(x % 258 == 0) {
                cnt ++;
            }
            x++;
        }
        System.out.println(cnt);

        System.out.println("\n\n1000의 약수의 개수를 출력하세요");
        // 1000의 약수의 개수를 출력하세요.
        int y = 1;
        int yCnt = 0;
        while( y <= 1000 ) {
            if( 1000 % y == 0) {
                yCnt++;
            }
            y++;
        }
        System.out.println( yCnt );

    }

}
