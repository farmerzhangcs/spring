package cn.com.string;

import javax.sound.midi.Soundbank;

public class MyString {
    public static void main(String[] args) {
        String s1 = new String();
        System.out.println(s1);

        char[] charArray = {'A','B','C'};
        String s2 = new String(charArray);
        System.out.println(s2);

        byte[] byteArray = {97, 98, 'c'};
        String s3 = new String(byteArray);
        System.out.println(s3);

        String s4 = "hello";
        System.out.println(s4);

        System.out.println(s4.length());

        String s5 = s4.concat("world");
        System.out.println(s5);
        System.out.println(s4);

        char c = s5.charAt(1);
        System.out.println(c);

        System.out.println(s5.indexOf('w'));
        System.out.println(s5.indexOf("owo"));

        char [] chars = "hello".toCharArray();

        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }

        byte [] bytes = "world".getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }

        String strold = "how do you do?";
        String strnew = strold.replace("do", "aaa");
        System.out.println(strnew);
        String strnew2 = strold.replace('o','m');
        System.out.println(strnew2);

        String str9 = "aaa,bbb,ccc,ddd";
        String[] str10 = str9.split(",");
        for (int i = 0; i < str10.length; i++) {
            System.out.println(str10[i]);
        }

        String str3 = "aaa.bbb.ccc";
        String[] array3 = str3.split("\\.");
        for (int i = 0; i < array3.length; i++) {
            System.out.println(array3[i]);
        }
    }
}

