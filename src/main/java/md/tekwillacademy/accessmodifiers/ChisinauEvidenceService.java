package md.tekwillacademy.accessmodifiers;

import md.tekwillacademy.accessmodifiers.peopleevidence.Person;

public class ChisinauEvidenceService {

    public static void main(String[] args) {

        Person ionelBaiatGrozav = new Person();
        Person marcelBoy = new Person("Marcel Bivol", 79886584, 65, "Unknown");

        System.out.println(marcelBoy.getAge());
        System.out.println(ionelBaiatGrozav.getAge());

        ionelBaiatGrozav.name = "Ion Bostanel";
        marcelBoy.name = "Marcel Bivol";
        Person raisaPacalo001 = new Person("Raisa Pacalo","F");
        System.out.println(raisaPacalo001.getGender());
        System.out.println(raisaPacalo001.toString());
        System.out.println("Numele obiectului: " + raisaPacalo001.name);

        System.out.println(Person.nationality);
        Person.nationality = "Moldovean Editat";
        System.out.println(Person.nationality);

    }
}
