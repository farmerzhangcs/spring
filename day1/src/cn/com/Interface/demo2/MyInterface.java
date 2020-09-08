package cn.com.Interface.demo2;

public interface MyInterface extends MyInterfaceA, MyInterfaceB{
    public abstract void method();

    @Override
    default void methodDefault() {
        System.out.println("M");
    }
}
