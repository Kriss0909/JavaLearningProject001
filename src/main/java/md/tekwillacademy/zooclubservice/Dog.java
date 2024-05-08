package md.tekwillacademy.zooclubservice;

public class Dog extends Animal {
    public Dog (String dogName){

        super(dogName);
    }
    @Override
    public void eat() {
        System.out.println(getName() + "dog is eating bones");
    }

    @Override
    public void makeSound() {
        System.out.println("The Dog is making BRRR! HRRR! Wuf Wuf!");

    }
}

