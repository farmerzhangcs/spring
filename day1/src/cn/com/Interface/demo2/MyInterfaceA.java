package cn.com.Interface.demo2;

public interface MyInterfaceA {
    public abstract void methodA();
    public abstract void methodCommon();

    public default void methodDefault(){
        System.out.println("aaa");
    }
}
