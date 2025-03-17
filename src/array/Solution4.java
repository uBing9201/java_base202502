package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution4 {

    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) throws IOException {

        // 9
        // 32 55 62 20 250 370 200 30 100
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] arr = new int[N];
        int[] reversedArr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            reversedArr[i] = Integer.parseInt(new StringBuilder(String.valueOf(arr[i])).reverse().toString());

            if (isPrime(reversedArr[i])) System.out.print(reversedArr[i] + " ");
        }

        br.close();

        // 9
        // 32 55 62 20 250 370 200 30 100
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int N = Integer.parseInt(br.readLine());
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        int[] arr = new int[N];
//
//        for (int i = 0; i < N; i++) {
//            arr[i] = Integer.parseInt(st.nextToken());
//
//            int temp = arr[i];
//            int result = 0;
//            while (temp > 0) {
//                int t = temp % 10;
//                result = result * 10 + t;
//                temp = temp / 10;
//            }
//
//            if (isPrime(result)) System.out.print(result + " ");
//        }
    }
}
