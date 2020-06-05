package com.company;

public class Fish extends Animal {
    int gills;
    int eyes;
    int fins;
    String name;

    public Fish(String name, int size, int weight) {
        super(name,1,1, size, weight);
        this.gills = gills;
        this.eyes = eyes;
        this.fins = fins;
    }

    private void rest(){

    }

    private void moveMuscles(){

    }

    private void moveBackFin(){

    }

    private void swim(int speed){
        moveMuscles();
        moveBackFin();
        super.move(speed);

    }
}
