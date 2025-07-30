package day24;

public class User {
    String name;

    public User(int age, String email) {
        this.age = age;
        this.email = email;
    }

    public User(String name, long phone) {
        this.name = name;
        this.phone = phone;
    }

    int age;
    String email;
    String password;
    long phone;

    public User(String name, int age, String email, String password, long phone) {
        this.name = name;
        this.age = age;
        this.email = "jason.roger@janbask.com";
        this.password = password;
        this.phone = phone;
    }

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public User(String name, int age, int phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }
}
