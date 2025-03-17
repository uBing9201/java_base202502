package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class TwoPointer1 {

    public static void main(String[] args) throws IOException {

        /*
            3
            1 3 5
            5
            2 3 6 7 9

            return = 1 2 3 3 5 6 7 9
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr1 = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            arr1[i] = Integer.parseInt(st.nextToken());
        }

        int M = Integer.parseInt(br.readLine());
        int[] arr2 = new int[M];
        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < M; i++) {
            arr2[i] = Integer.parseInt(st2.nextToken());
        }

        solution(N, M, arr1, arr2);

    }

    private static void solution(int n, int m, int[] a, int[] b) {
        List<Integer> answer = new ArrayList<>();

        int p1 = 0, p2 = 0;
        // 이 반복문은 작은 배열이 끝나면 종료됨. (작은 배열이 누군지는 모르겠지만)
        while (p1 < n && p2 < m) {
            if (a[p1] < b[p2]) answer.add(a[p1++]);
            else answer.add(b[p2++]);
        }

        while (p1 < n) answer.add(a[p1++]);
        while (p2 < m) answer.add(b[p2++]);

        for (Integer i : answer) {
            System.out.print(i + " ");
        }
    }

}
