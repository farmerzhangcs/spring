package cn.com.internal.demo1;

public class Outer {

    public void methodOuter() {
        final int num = 10;
        class Inner {
            public void methodInner() {
                System.out.println(num);
            }
        }

        Inner inner = new Inner();
        inner.methodInner();
    }
}
