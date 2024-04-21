package md.tekwillacademy.classesandobjects.autoservicetask;

public class Car {
    String make;
    String colorOFTheCar;
    int numberOfDoors;
    int motorCapacity;
    public Car (String make,String colorOFTheCar,int numberOfDoors,int motorCapacity){
        System.out.println("This is a ful constructor with all the params included ");
        this.make = make;
        this.colorOFTheCar = colorOFTheCar;
        this.numberOfDoors = numberOfDoors;
        this.motorCapacity = motorCapacity;
        System.out.println("The object is created,bingo!");


}
}
