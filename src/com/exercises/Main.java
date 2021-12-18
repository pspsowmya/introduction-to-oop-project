package com.exercises;

public class Main {
    public static void main(String[] args) {

        Pigeon pippa = new Pigeon("Pippa", "Grey");
        pippa.speak();
        pippa.fly();
        pippa.eatPizza();
        pippa.spin();
        pippa.doTheCaterpillar();
        pippa.jump();

        Penguin pingu = new Penguin("Pingu", "Black & White");
        pingu.speak();
        pingu.fly();
        pingu.spin();
        pingu.doTheCaterpillar();
        pingu.jump();

        Parrot parrot = new Parrot("Pichku", "Green");
        parrot.speak();
        parrot.fly();
        parrot.spin();
        parrot.doTheCaterpillar();
        parrot.jump();
    }
}
