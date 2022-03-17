package com.isep;

interface Animal {
    public void sound();
}

class Fox implements Animal, Wild {
    String name;
    public void sound() {
        System.out.println("Fox : Wa-pow");
    }
    public Fox(String name){
        this.name = name;
    }
    public void printName() {
        System.out.println("Dog’s name is " + name);
    }
}


class Cat implements Animal, Domestic {
    String name;
    public void sound() {
        System.out.println("Cat :Meow");
    }
    public Cat(String name){
        this.name = name;
    }
    public void printName() {
        System.out.println("Cat’s name is " + name);
    }
}
class Dog implements Animal, Domestic {
    String name;
    public void sound() {
        System.out.println("Dog : Bark");
    }
    public Dog(String name){
        this.name = name;
    }
    public void printName() {
        System.out.println("Dog's name is " + name);
    }
}

class Animals {
    public void main() {
        Fox myFox = new Fox("Paul_Fox");
        Cat myCat = new Cat("Paul_Cat");
        Dog myDog = new Dog("Paul_Dog");
        myFox.sound();
        myFox.printName();
        myCat.sound();
        myCat.printName();
        myDog.sound();
        myDog.printName();
    }
}
