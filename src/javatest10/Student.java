package javatest10;

import java.io.*;

public class Student implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name;
    private int age;

    public Student() {

    }
    public Student(String name, int age){
        this.name = name;
        this.age = age;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String [] args) {
        Student stu = new Student("zhangsan", 18);
        try{
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("src//javatest10//person.txt"));
            os.writeObject(stu);
        } catch(Exception e) {
            e.printStackTrace();
        }

        try{
            ObjectInputStream is = new ObjectInputStream(new FileInputStream("src//javatest10//person.txt"));
            Student oneRestore = (Student) is.readObject();
            System.out.println("the output name is: " + oneRestore.name);
            System.out.println("the output age is: " + oneRestore.age);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
