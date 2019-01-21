package com.company;

public class Dog {
    private String breed;
    private int age;
    private double weight;
    private String name;

    public Dog(){
        this.breed = "Half-blood";
    }

    public Dog(String breed) {
        this.breed = breed;
    }

    public Dog(int age, double weight) {
        this.age = age;
        this.weight = weight;
    }

    public Dog(String breed, int age, double weight) {
        this.breed = breed;
        this.age = age;
        this.weight = weight;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if( age >= 0) {
            this.age = age;
        }

    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(!name.trim().equals("")) {
            this.name = name;
        }
    }
    public void run(){
        System.out.println("I'm " + this.name + "and i'm running");
    }

    public void sleep(){
        System.out.println("ZzZzZzZzZ...(" + this.name + ")" );
    }

    public void bark(){
        System.out.println("(" + this.name +") Woof. Woof.");
    }

    public static void howl() {
        System.out.println("Hoooooooowwwwwl");
    }
}


