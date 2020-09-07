package cn.com.Static;

import static cn.com.Static.MyStatic.setRoom;

public class test {
    public static void main(String[] args) {
        MyStatic one = new MyStatic("james", 10);
        MyStatic two = new MyStatic("wade", 20);

        setRoom("101");

        System.out.println(one.getRoom());

        MyStatic.setRoom("202");
        System.out.println(MyStatic.getRoom());
        System.out.println(two.getRoom());

        System.out.println(one);
        System.out.println(two);
    }
}
