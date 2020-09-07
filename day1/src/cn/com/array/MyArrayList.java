package cn.com.array;

import java.util.ArrayList;

public class MyArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("hello");
        list.add("hello");
        System.out.println(list);
        list.remove("hello");
        System.out.println(list);

        ArrayList<Person> person = new ArrayList<>();

        Person person1 = new Person("james", 1);
        Person person2 = new Person("wade", 2);
        Person person3 = new Person("wade", 2);

        person.add(person1);
        person.add(person2);

        System.out.println(person);

        //person.remove(person2);
        System.out.println(person);

        // System.out.println(person.size());

        System.out.println(person.get(1));

        Person v = person.get(1);
        System.out.println(v);

        for (int i = 0; i < person.size(); i++) {
            System.out.println(person.get(i));
        }

        ArrayList<Integer> inList = new ArrayList<>();
        inList.add(100);
        inList.add(101);
        System.out.println(inList);

        int m = 100;
        Integer n = m;
        System.out.println(n);

        if (m == n){
            System.out.println("equal");
        }
    }
}