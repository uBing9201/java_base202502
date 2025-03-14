package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution8 {

//    static char toAscii(String in) {
//        int sum = 0;
//        // i 는 문자열의 인덱스, j는 지수의 인덱스
//        for(int i = 0, j = 6; i < in.length(); i++, j--) {
//            if(in.charAt(i) == '#') {
//                sum += Math.pow(2, j);
//            }
//        }
//        return (char)sum;
//    }

    public static void main(String[] args) throws IOException {

//        Scanner sc = new Scanner(System.in);
//        int count = sc.nextInt(); int len = 7;
//        sc.nextLine();
//        String line = sc.nextLine();
//
//        String [] str = new String[count];
//        for (int i = 0, index = 0; i < line.length(); i += len, index++) {
//            str[index] = line.substring(i, i + len);
//        }
//        char[] result = new char[count];
//        for(int i = 0; i < count; i++) {
//            result[i] = toAscii(str[i]);
//        }
//        System.out.println(new String(result).toString());
//        sc.close();





//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        sc.nextLine();
//        String msg = sc.nextLine();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("입력받을 글자의 수: ");
        int n = Integer.parseInt(br.readLine());
        System.out.println("변환할 문자 입력: ");
        String msg = br.readLine();

        //#****###**#####**#####**##**
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < n; i++) {
            String temp = msg.substring(i * 7, (i * 7) + 7)
                            .replace('#', '1')
                            .replace('*', '0');

            int num = Integer.parseInt(temp, 2);
            answer.append((char)num);
        }

        System.out.println(answer);

//        sc.close();
    }

}
