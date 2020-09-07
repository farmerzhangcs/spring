package cn.com.inheriate.demo01;

public class Parent {
    int num = 10;

    public void method(){
        System.out.println("parent");
    }

    public Parent(int num){
        System.out.println("parent construct");
    }
}
