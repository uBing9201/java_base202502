package stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class Solution3 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        Deque<Character> stack = new ArrayDeque<>();
        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (c == '(') {
                stack.push(c);
                System.out.println(c);
            } else if (c == ')') {
                stack.pop();
                System.out.println(c);
            } else {
                if (stack.isEmpty()) {
                    sb.append(c);
                }
            }
        }

        System.out.println(sb);

        br.close();
    }

}
