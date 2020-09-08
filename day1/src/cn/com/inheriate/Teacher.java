package cn.com.inheriate;

public class Teacher extends Employee{

    public static void method(){
        Employee.method();
        System.out.println("Teacher method");
    }
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.method();
    }
}
