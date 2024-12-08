package Inheritance;


class Animal {

    String name;
    int age;


    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public void makeSound() {
        System.out.println("Some generic animal sound");
    }


    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}


class Dog extends Animal {

    String breed;


    public Dog(String name, int age, String breed) {

        super(name, age);
        this.breed = breed;
    }


    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }


    public void displayDogInfo() {
        displayInfo(); // Call the parent method
        System.out.println("Breed: " + breed);
    }
}


class Main {
    public static void main(String[] args) {

        Dog myDog = new Dog("Buddy", 5, "Golden Retriever");


        myDog.displayDogInfo();  // Displays inherited and specific attributes
        myDog.makeSound();       // Calls the overridden method
    }
}

