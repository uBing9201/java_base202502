package string;

import java.util.Scanner;

public class Solution5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();

        // 알파벳만 남기고 소문자로 변환
        String str2 = str1.replaceAll("[^a-zA-Z]", "").toLowerCase();

        // 문자열 뒤집기
        String str3 = new StringBuilder(str2).reverse().toString();

        // 비교하여 팰린드롬 판별
        if (str2.equals(str3)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");

        }
        sc.close();

        String str = null;
        StringBuilder sb = new StringBuilder();

        // 특문, 숫자, 공백 제거
        for(char c : str.toCharArray()) {
            if(Character.isLetter(c)) {
                sb.append(c);
            }
        }

    }

}
