package queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;

public class Solution6 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String need = br.readLine();  // 필수 과목 순서
        String plan = br.readLine();  // 수업 계획

        Queue<Character> queue = new ArrayDeque<>();

        // 필수 과목을 큐에 삽입
        for (char c : need.toCharArray()) {
            queue.add(c);
        }

        // 수업 계획을 순서대로 확인
        for (char c : plan.toCharArray()) {
            if (!queue.isEmpty() && queue.peek() == c) {  // 필수 과목 순서대로 등장하는지 확인
                queue.poll();
            }
        }

        // 필수 과목을 전부 이수했는지 확인
        if(queue.isEmpty()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}