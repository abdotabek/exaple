package org.example.leet;

public final class Class {
    private final String name;
    private final int age;

    public Class(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String name() {
        return name;
    }

    public int age() {
        return age;
    }

    @Override
    public String toString() {
        return "Class{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
