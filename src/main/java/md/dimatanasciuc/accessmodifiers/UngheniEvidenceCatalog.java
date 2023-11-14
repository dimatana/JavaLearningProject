package md.dimatanasciuc.accessmodifiers;

import md.dimatanasciuc.accessmodifiers.peopleevidence.Person;

public class UngheniEvidenceCatalog {
    public static void main(String[] args) {
        //Crearea unui obiect Person, numit dimaPerson - folosind cuvintul cheie new si constructorul cu 3 parametri
        //definiti in clasa Person
        Person dimaPerson = new Person("Dima", "Tana", 16845178, 28, "Romana 10", "masculin", "true");

        //Proprietatea dimaPerson.isRetired detin modificatorul public ceea ce ofera posibilitatea de-al edita din oricare loc al proiectului
        dimaPerson.isRetired = true;

        // Proprietatea isRetired este de tipul boolean si serveste drept donditie pentru instructiunea IF
        if (dimaPerson.isRetired) {
            // Codul executat in cazul undei conditii adevarate
            System.out.println("Dima este la pensie");

        } else {
            // Codul executat in cazul unei conditii false in blocul IF
            System.out.println("Dima nu este la pensie");
        }
        Person denCot = new Person("Denis", "Cot", 64856215, 28, "Romana 10", "masculin", "true");
        if (denCot.isRetired) {
            System.out.println("Denis este la pensie ");
        } else {
            System.out.println("denis nu este la pensie");
        }
        Person janCucu = new Person("Jan", "Cucu", 68451648, 28, "romana 666", "masculin", "false");
        if (janCucu.isRetired){
            System.out.println("Jan este la pensie");
        } else {
            System.out.println("Jan nu este la pensie hatea are 28 de ani, miine-poimiine deja 30)");
        }

    }
}
