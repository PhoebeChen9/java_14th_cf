package main.java;

public class User {
    String name;
    String classname;
    int age;

    public User() {
    }

    public User(String name, String classname, int age) {
        this.name = name;
        this.classname = classname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", classname='" + classname + '\'' +
                ", age=" + age +
                '}';
    }
}
