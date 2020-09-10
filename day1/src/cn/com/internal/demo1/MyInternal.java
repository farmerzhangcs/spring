package cn.com.internal.demo1;

import javax.sound.midi.Soundbank;
import java.lang.reflect.Method;

public class MyInternal {

    public class internal{
        private int a;

        public int getA() {
            return a;
        }

        public void setA(int a) {
            this.a = a;
        }

        public internal() {
            System.out.println("nei bu gouzao ");
        }

        public void method2(){
            System.out.println("neibu");
        }
    }

    private int b;
    public int m;

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public MyInternal(int b) {
        this.b = b;
    }

    public void method(){
        System.out.println("waibu");
    }
}
