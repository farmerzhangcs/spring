package cn.com.internal.demo2;

import java.util.ArrayList;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        new MyInterface() {
            @Override
            public void method() {
                System.out.println("匿名内部类实现了方法");
            }
        }.method();

        ArrayList
    }
}
