package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution2018 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        // 연속된 자연수의 합으로 표현할 수 있는 경우의 수를 저장할 변수
        int count = 0;
        // 연속된 자연수의 개수를 나타내는 변수 (k)
        int K = 1;

        while (true) {
            // k개의 연속된 자연수의 합이 되려면, N에서 연속된 수들의 합(첫항 x를 제외한 나머지 부분)을 빼야 함
            // 연속된 자연수의 합은 등차수열의 합 공식을 이용하여 k*(k-1)/2 로 계산됨
            int temp = N - (K * (K - 1)) / 2;
            if (temp <= 0) break;
            // temp가 k로 나누어 떨어지면, 첫 번째 자연수 x가 자연수여야 하므로 경우의 수 증가
            if (temp % K == 0) count++;
            K++;
        }

        System.out.println(count);

        br.close();
    }

}
