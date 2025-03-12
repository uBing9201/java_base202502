package etc.generic.good;

import etc.generic.bad.Person;

public class Main {

    public static void main(String[] args) {

        Box<String> box = new Box<>();

        box.setObj("김춘식");

        int length = box.getObj().length();

        Box<Person> pBox = new Box<>();

        pBox.setObj(new Person());
        String name = pBox.getObj().getName();

        System.out.println("---------------------------------------------");

        MultiBox<String, Integer> multi = new MultiBox<>();
        multi.put("메롱이", 10);
        int i = multi.get();

        System.out.println(i);

    }

}
