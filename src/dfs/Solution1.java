package dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution1 {

    static int N;
    static int[] check;

    static void DFS(int L) {

        if (L == N + 1) { // 기저 조건: 끝까지 탐색하면 부분집합 출력
            StringBuilder sb = new StringBuilder();
            for (int i = 1; i <= N; i++) {
                if (check[i] == 1) {
                    sb.append(i).append(" ");
                }
            }
            if (!sb.isEmpty()) {
                System.out.println(sb);
            }
        } else {
            check[L] = 1;
            DFS(L + 1); // lt

            check[L] = 0;
            DFS(L + 1); // rt
        }

    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        check = new int[N + 1];
        DFS(1);

        br.close();

    }

}
