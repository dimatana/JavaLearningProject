package md.tekwillacademy.variablesprogramme;

public class VariablesAndComments {
    public static void main(String[] args) {
        //declare the variables

        boolean isUsed;
        boolean hasBattery;
        boolean isAndroid;
        boolean isStolen;
        boolean is5G;

        char condition;
        byte numberOfSimCards;
        byte randomAccesMemory;
        short productionYear;

        int numberOfOwners;
        int id;

        float operatingSistemVersion;

        double price;

        //Initialize an Iphone
        isUsed = false;
        hasBattery = true;
        isAndroid = false;
        isStolen = false;
        is5G = true;

        condition = 'A';
        numberOfSimCards = 2;
        randomAccesMemory = 4;
        productionYear = 2023;
        numberOfOwners = 0;
        operatingSistemVersion = 16.4F;
        price = 24342.3;

        System.out.println("The phone is used " + isUsed);
        System.out.println("The phone price is " + price);

    }
}
