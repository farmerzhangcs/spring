package cn.com.multi.instance;

public class main {
    public static void main(String[] args) {
        Parent p = new Child();
        System.out.println(p.getClass());
        System.out.println(p instanceof Child2);
    }
}
