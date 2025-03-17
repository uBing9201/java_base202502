package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution3 {

    public static void main(String[] args) throws IOException {

        /*
        - 5
          2 3 3 1 3
          1 1 2 2 3
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");

        int[] A = new int[N];
        int[] B = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
            B[i] = Integer.parseInt(st2.nextToken());

            if (A[i] == B[i])  System.out.println("D");
            else if (A[i] == 1 && B[i] == 3) System.out.println("A");
            else if (A[i] == 2 && B[i] == 1) System.out.println("A");
            else if (A[i] == 3 && B[i] == 2) System.out.println("A");
            else System.out.println("B");
        }
    }
}
