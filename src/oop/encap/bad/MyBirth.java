package oop.encap.bad;

public class MyBirth {

    int year;
    int month;
    int day;

    void birthInfo(){
        System.out.printf("내 생일은 %d년 %02d월 %02d일 입니다.\n"
                , this.year, this.month, this.day);
    }

}
