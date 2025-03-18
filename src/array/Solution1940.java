package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution1940 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int start = 0, end = N - 1, count = 0;

        while (start < end) { // 수정된 종료 조건
            int total = arr[start] + arr[end];

            if (total < M) { // 합이 부족하면 start 증가
                start++;
            } else if (total == M) { // 갑옷을 만들 수 있는 경우
                count++;
                start++;
                end--;
            } else { // 합이 넘치는 경우 end 감소
                end--;
            }
        }

        System.out.println(count);

        br.close();
    }
}
