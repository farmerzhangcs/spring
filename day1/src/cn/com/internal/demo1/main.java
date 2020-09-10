package cn.com.internal.demo1;

public class main {
    public static void main(String[] args) {
        MyInternal p = new MyInternal(1);
        p.method();
        MyInternal.internal m = new MyInternal(1).new internal();
    }

}
