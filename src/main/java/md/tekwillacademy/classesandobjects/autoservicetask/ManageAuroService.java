package md.tekwillacademy.classesandobjects.autoservicetask;

public class ManageAuroService {
    public static void main(String[] args) {
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

    Garage garageOpel = new Garage();
    }
}
