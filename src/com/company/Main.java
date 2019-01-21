package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Dog pegamento,pluto, bob, fifi;

        pegamento = new Dog("Dalmata");
        pluto = new Dog(5, 25.0);
        bob = new Dog("Chihuahua", 9, 20);
        fifi = new Dog(15, 80);

        pegamento.setName("Pegamento");
        pluto.setName("Pluto");
        bob.setName("Pluto");
        fifi.setName("Fifi");

        pegamento.setAge(2);
        pegamento.setWeight(20.0);

        pluto.setBreed("CollieConDeLa");

        fifi.setBreed("Doberman Pinscher");

        fifi.bark();
        pegamento.run();
        pluto.sleep();
        bob.run();
        fifi.sleep();
        pegamento.bark();

    }
}
