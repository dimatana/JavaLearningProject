package md.dimatanasciuc.zooclubservice;

public class ZooService {
    public static void main(String[] args) {

        Animal janDog = new Dog("Jany", true);
        System.out.println(janDog.getName());

        janDog.eat();
        janDog.makeSound();

        Dog cristiDog = new Dog("Cristi", true);
        System.out.println(cristiDog.getName());

        Cat denisCat = new Cat("Denis");
        denisCat.eat();
        denisCat.makeSound();

    }
}
