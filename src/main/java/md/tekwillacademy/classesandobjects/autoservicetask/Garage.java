package md.tekwillacademy.classesandobjects.autoservicetask;

import org.w3c.dom.ls.LSOutput;

public class Garage {
    String address;
    int numberOfBoxes;
    double dimensionSqFt;
public Garage( String addressUsedForInitialization, int numberOfBoxes, double dimensionSqFt){
    address = addressUsedForInitialization;
    this.numberOfBoxes = numberOfBoxes;
    this.dimensionSqFt = dimensionSqFt;


}
public Garage(){
    System.out.println("A fost creat un obiect care insa nu are nici un parametru populat cu date concrete,acesta " +
            "este constructor definit fara paramentri");
}
}
