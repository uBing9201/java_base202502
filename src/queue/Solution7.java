package queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Patient {

    int index; // 환자의 인덱스 (M번째 환자 파악)
    int risk;  // 환자의 위험도

    public Patient(int index, int risk) {
        this.index = index;
        this.risk = risk;
    }
}

public class Solution7 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int N = Integer.parseInt(st.nextToken()); // 환자 수
        int M = Integer.parseInt(st.nextToken()); // 찾고 싶은 환자의 인덱스

        Queue<Patient> queue = new LinkedList<>();
        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; i++) {
            int risk = Integer.parseInt(st.nextToken());
            queue.offer(new Patient(i, risk));
        }

        int count = 0; // 몇 번째로 진료받는지 카운트

        while (!queue.isEmpty()) {
            Patient current = queue.poll();
            boolean hasHigherRisk = false;

            // 현재 환자보다 위험도가 높은 환자가 있는지 확인
            for (Patient p : queue) {
                if (p.risk > current.risk) { // 더 높은 위험도를 가진 환자가 있으면
                    hasHigherRisk = true;
                    break;
                }
            }

            if (hasHigherRisk) {
                queue.offer(current); // 현재 환자를 다시 대기열 끝으로 보냄
            } else {
                count++; // 진료받음
                if (current.index == M) { // 찾고 싶은 환자가 진료받으면 종료
                    System.out.println(count);
                    return;
                }
            }
        }
    }
}