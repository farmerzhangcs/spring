package cn.com.array;

public class MyArray {

    public static void main(String[] args) {
        Person[] array = new Person[3];

//        array[0] = new Person("Wade", 30);
//        array[1] = new Person("Jame", 30);
//        array[2] = new Person("Griffin", 30);

        Person one = new Person("Wade", 30);
        Person two = new Person("Jame", 30);
        Person three = new Person("Griffin", 30);

        array[0] = one;
        array[1] = two;
        array[2] = three;

        System.out.println(array);
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);

        System.out.println(array[0].getName());
        System.out.println(array[0].getClass());
    }
}
