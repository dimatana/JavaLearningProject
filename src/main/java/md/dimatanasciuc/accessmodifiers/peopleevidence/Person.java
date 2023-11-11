package md.dimatanasciuc.accessmodifiers.peopleevidence;

public class Person {
    //Proprietatile private pot fi apelate si folosite doar in interiorul clasei.
    // daca vom avea Person dimaPerson atunci dimaPerson.name nu va putea fi accesat.
    public String name;
    public String surname;
    // O proprietate FINAL reprezinta o constanta, asta inseamna ca ea nu se va
    // schimba in timp, prin urmare trebuie ca fiecare obiect initializat sa aiba un ID, acesta fiind inclus in Constructor.
    private final long ID;
    public String sex;
    protected String residence;

    public int age;
    public boolean isRetired;

// Constructorul de mai jos va permite crearea obiectelor Person care dispun de name, surname si id. Celelalte proprietati
    //vor fi nule initial astfel ar trebui sa folosim numeObject.numeProprietate pentru a le popula ulterior

    public Person(String name, String surname, long id, int age, String residence, String masculin, String aTrue) {
        this.name = name;
        this.surname = surname;
        ID = id;
        System.out.println("Un obiect de tip Person a fost creat, folosind un constructor cu 3 parametri formali");
    }

    // Constructorul de mai jos accepta o serie de variabile locale si le foloseste pentru a popula proprietatile unui nou obiect
    public Person(String name, String surname, long id, int age, String residence, String sex,  boolean isRetired){
        this.name = name;
        this.surname = surname;
        ID = id;
        this.age = age;
        this.residence = residence;
        this.sex = sex;
        this.isRetired = isRetired;
        System.out.println("Un obiect de tip Person a fost creat, folosind un constructor cu 7 parametri formali");
    }

}
