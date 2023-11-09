package md.dimatanasciuc.classesandobjects.autoservicetask;

public class Car {
    public String plateNumber;
    public int kmWhenEnteredTheService;
    public String color;
    public String make;
    public String model;

    // Constructorul de mai jos primeste 3 parametri de intrare, in rezultat a crea un obiect Car despre
    // care se va cunoasate marca, modelul, culoarea dar nu si alte detalii precum plateNumber si km
    public Car (String makeParametruDeIntrare, String modelFormalParameter, String colorLocalVariable) {
        this.make = makeParametruDeIntrare;
        this.model = modelFormalParameter;
        this.color = colorLocalVariable;
    }
    // Acest constructor va crea un obiect de tipul Car despre care vom cunoaste doar numarul de imatriculare
    public Car(String plateNumber) {
        this.plateNumber = plateNumber;
    }

}
