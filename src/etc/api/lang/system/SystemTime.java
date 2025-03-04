package etc.api.lang.system;

public class SystemTime {

    public static void main(String[] args) {

        // 1970년 1월 1일 자정을 기준으로 현재까지 소요된 시간을 밀리초로 리런(long)
        long start = System.currentTimeMillis();

        int total = 0;
        for (int i = 0; i < 2000000000; i++) {
            total += i;
        }

        long end = System.currentTimeMillis();

        System.out.println("실행 소요 시간: " + (end - start) * 0.001 + "초");

    }

}
