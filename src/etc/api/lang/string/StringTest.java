package etc.api.lang.string;

public class StringTest {

    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        /*
        String str = "a";
        for (int i = 0; i < 500000; i++) {
            str += "a";
        }
        */

        StringBuilder sb = new StringBuilder("a");
        for (int i = 0; i < 500000; i++) {
            sb.append("a");
        }

        long end = System.currentTimeMillis();

        System.out.println("실행 결과: " + (end - start) * 0.001 + "초");

        double pi = 3.141592;
        long result = Math.round(pi * 1000);

        System.out.println(result * 0.001);

    }

}
