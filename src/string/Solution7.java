package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution7 {

    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
//        String s = sc.next();
//
//        StringBuilder result = new StringBuilder();
//
//        int dup = 1;
//        for(int i = 0; i < s.length() - 1; i++) {
//            if (s.charAt(i) == s.charAt(i + 1)) dup++;
//            else {
//                result.append(s.charAt(i));
//                if (dup != 1) {
//                    result.append(Integer.toString(dup)); dup = 1;
//                }
//            }
//        }
//
//        result.append(s.charAt(s.length() - 1));
//        if (dup != 1) {
//            result.append(Integer.toString(++dup));
//        }
//
//        System.out.println(result);
//
//        sc.close();

        // KKHSSSSSSSE
//        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        String answer = "";
        str = str + " ";
        int cnt = 1;

        // KKHSSSSSSSE
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                cnt++;
            } else {
                answer += str.charAt(i);
                if (cnt > 1) {
                    answer += cnt;
                }
                cnt = 1;
            }
        }

        System.out.println(answer);
//        sc.close();
    }
}