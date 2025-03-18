package hash;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Solution3 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] cards = new int[N];
        for (int i = 0; i < N; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }

        // TreeSet을 사용하여 중복 제거 및 내림차순 정렬
        TreeSet<Integer> sums = new TreeSet<>(Collections.reverseOrder());

        // 3장의 카드를 뽑아 가능한 모든 합을 TreeSet에 저장
        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                for (int k = j + 1; k < N; k++) {
                    sums.add(cards[i] + cards[j] + cards[k]);
                }
            }
        }

        Iterator<Integer> iter = sums.iterator();
        int count = 0;
        int result = -1;

        while (iter.hasNext()) {
            count++;
            int num = iter.next();
            if (count == K) {
                result = num;
                break;
            }
        }

        System.out.println(result);
    }
}
