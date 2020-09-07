package cn.com.array;

public class MyArrayCompare {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";

        char[] charArray = {'h','e','l','l','o'};
        byte[] bytes = {'h','e','l','l','o'};

        String str3 = new String(charArray);
        String str4 = new String(bytes);

        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str3));
        System.out.println(str2.equals(str4));

        String str5 = "Hello";
        System.out.println(str1.equalsIgnoreCase(str5));
        System.out.println(str1.length());
    }
}
