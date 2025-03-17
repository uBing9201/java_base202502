package prime;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution1929 {

    public static int[] isPrime(int m, int n) {
        int[] arr = new int[n + 1];
        // 배열에 숫자를 가득 채우자
        for (int i = 2; i <= n; i++) {
            arr[i] = i;

            // 배수를 증가시키는데, 이미 0으로 지워졌다면 건너뛰어라
            if (arr[i] == 0) continue;

            // 자기 자신을 제외하고 나머지 배수를 전부 0으로 만들자.
            // j는 i의 배수만큼 증가
            for (int j = i + i; j <= n; j += i) {
                arr[j] = 0;
            }
        }
        return arr;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        long start = System.currentTimeMillis();

        int[] prime = isPrime(M,N);
        for (int i = M; i < N; i++) {
            // 소수가 아닌 수들은 0으로 지워졌을테니
            // 0 이 아닌 애들만 출력하자.
            if(prime[i] != 0) {
                sb.append(prime[i]).append("\n");
            }
        }
        System.out.println(sb);

        long end = System.currentTimeMillis();

        System.out.println((end - start) + "ms");

        br.close();

    }

}
