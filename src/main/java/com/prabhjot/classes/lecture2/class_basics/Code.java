package com.prabhjot.classes.lecture2.class_basics;

public class Code {
    public static void main(String[] args) {
        Person p1 = new Person("Prabhjot", 19);
        p1.display();
    }
}

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println(STR."""
                    Name : \{this.name}
                    Age : \{this.age}
                    """);
    }
}