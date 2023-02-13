package com.enigma.model;

public class Student {
    private String NIM;
    private String name;
    private int age;
    private String address;

    private Raport raport;

    public Student(String NIM, String name, int age, String address) {
        this.NIM = NIM;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Raport getRaport() {
        return raport;
    }

    public void setRaport(Raport raport) {
        this.raport = raport;
    }
}
