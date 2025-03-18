package dfs;

import java.io.*;
import java.util.*;

public class Solution2 {

    static int N, M, answer = 0;
    static int[][] graph;
    static int[] ch; // 방문 체크 배열

    static void DFS(int y) {
        if (y == N) { // 목적지 도달 시 경로 개수 증가
            answer++;
        } else {
            for (int i = 1; i <= N; i++) {
                if (graph[y][i] == 1 && ch[i] == 0) { // 연결된 노드 && 방문하지 않은 노드
                    ch[i] = 1;
                    DFS(i);
                    ch[i] = 0; // 백트래킹
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        N = Integer.parseInt(st.nextToken()); // 정점 개수
        M = Integer.parseInt(st.nextToken()); // 간선 개수

        // 인접 행렬 초기화
        graph = new int[N + 1][N + 1]; // 0번 버리고 1 ~ N번 인덱스 쓰려고함
        ch = new int[N + 1]; // 방문 체크 배열

        // 간선 정보 입력 (인접 행렬 방식)
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a][b] = 1; // 방향 그래프이므로 한쪽만 연결
        }

        ch[1] = 1; // 시작점 방문 처리
        DFS(1); // DFS 시작

        System.out.println(answer); // 경로 개수 출력
        br.close();
    }
}
