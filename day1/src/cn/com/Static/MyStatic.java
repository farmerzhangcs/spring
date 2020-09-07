package cn.com.Static;

public class MyStatic {
    String name;

    int age;

    private int id;

    static int idCounter = 10;

    static String room;

    public String getName() {
        return name;
    }

    public static String getRoom() {
        return room;
    }

    public static void setRoom(String room) {
        MyStatic.room = room;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getIdCounter() {
        return idCounter;
    }

    public static void setIdCounter(int idCounter) {
        MyStatic.idCounter = idCounter;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public MyStatic(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = ++idCounter;
    }

    @Override
    public String toString() {
        return "MyStatic{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }

    static {
        System.out.println("static method");
    }
}
