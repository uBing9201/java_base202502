package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution2 {

    static int n, m, answer = 0;
    static List<List<Integer>> graph;
    static int[] ch, dis;

    static void BFS(int v) {
        ch[v] = 1; // 노드 방문 체크
        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(v);
        dis[v] = 0; // 시작 노드의 거리는 0으로 설정

        while (!queue.isEmpty()) {
            int curr = queue.poll();
            for (int nv : graph.get(curr)) {
                if (ch[nv] == 0) {              // 방문한 적이 없는 노드라면
                    ch[nv] = 1;                 // 방문 체크
                    queue.offer(nv);            // 인접 노드를 큐에 삽입
                    dis[nv] = dis[curr] + 1;    // 현재 노드에서 인접 노드까지의 거리 갱신
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        ch = new int[N + 1]; // 방문 여부를 확인하는 배열
        dis = new int[N + 1]; // 1번 노드부터 각 노드까지의 최단 거리를 저장하는 배열
        graph = new ArrayList<>();

        // 그래프를 N+1 크기로 초기화 (1번부터 N번까지 인덱스 사용)
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        // 간선 정보 입력 받기
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.get(a).add(b); // a에서 b로 가는 간선 추가
        }

        BFS(1);

        // 출력 (각 노드까지의 최단 거리 출력)
        for (int i = 2; i <= N; i++) { // 1번 노드는 제외하고 출력
            System.out.println(i + ":" + dis[i]);
        }

        br.close();
    }
}