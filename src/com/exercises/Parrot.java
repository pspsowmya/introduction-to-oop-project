package com.exercises;

public class Parrot extends Bird{

    public Parrot(String name, String color){
        super(name,color);
    }

    @Override
    public void speak() {
        System.out.println("Hey ya! I'm "+name+" and I'm a "+color+ " parrot.");
    }

    @Override
    public void fly(){
        System.out.println("Hello ya! I can fly..!");
    }
}
