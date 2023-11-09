package md.dimatanasciuc.classesandobjects;

import md.dimatanasciuc.classesandobjects.autoservicetask.*;
import md.dimatanasciuc.classesandobjects.autoservicetask.*;

public class ManageAuroService {
    public static void main(String[] args) {
        Garage garageOpel;

        garageOpel = new Garage();
        garageOpel.address = "Romana 10";
        garageOpel.surfaceM2 = 500.0F;
        garageOpel.capacity = 5;

        System.out.println(" Obiectul garageOpel are urmatoarele proprietati: adresa " + garageOpel.address +
                " " + garageOpel.surfaceM2 + " " + garageOpel.capacity);


// Declararea si initializarea obiectelor folosind toate tipurile de constructii
        Car mercedesBenzSeriaE = new Car("E Class", "Mercedes", "rosu");

        mercedesBenzSeriaE.plateNumber = "UN BB 404";
        mercedesBenzSeriaE.kmWhenEnteredTheService = 178300;
        System.out.println("Masina " + mercedesBenzSeriaE.make + "de model " + mercedesBenzSeriaE.model + "de culoare " + mercedesBenzSeriaE.color +
                "are numaru de imatriculare " + mercedesBenzSeriaE.plateNumber + "si kilometrajul " + mercedesBenzSeriaE.kmWhenEnteredTheService);

        Car VWPolo = new Car("ABS 20");
        Car Skoda = new Car("UN BB 404");

        Tool perforator = new Tool("Perforator");
        perforator.weight = 2.1;
        System.out.println("Instrumentul cu numele " + perforator.name + "are greutatea de " + perforator.weight);
        Tool surupaviort = new Tool("Surupaviort");

        Worker dimaBoeviku = new Worker();
        dimaBoeviku.name = "Dima";
        dimaBoeviku.age = 30;

        System.out.println("Obiectul nostru are numele " + dimaBoeviku.name + "si are " + dimaBoeviku.age + " ani");

        Worker lol = new Worker();

        Person client1 = new Person("060793747");

        Person client22 = new Person();

    }
}
