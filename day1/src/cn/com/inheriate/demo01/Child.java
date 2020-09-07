package cn.com.inheriate.demo01;

public class Child extends Parent{
    int num = 20;

//    public void method(){
//        int num = 30;
//        System.out.println(num);
//        System.out.println(this.num);
//        System.out.println(super.num);
//    }

    @Override
    public void method(){
        System.out.println("child");
    }

    public Child() {
        super(10);
        System.out.println("child construct");

    }
}
