package org.example.Test;

public class Manager {

    public String name;
    protected String surname;

    public Manager() {
    }

    protected void detail() {
        System.out.println("name: " + name + " surname: " + surname);
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
