package md.dimatanasciuc.methodstask;

import java.util.UUID;

public class ExecutionService {
    public static void main(String[] args) {
        System.out.println(DataGeneratorUtil.getRandomInt(20,100));
        System.out.println(DataGeneratorUtil.getRandomInt(100,120));
        System.out.println(DataGeneratorUtil.getRandomInt(150,100));

        int randomInt = DataGeneratorUtil.getRandomInt(50);
        System.out.println(randomInt);

        System.out.println(DataGeneratorUtil.getRandomEmail("gmail.com"));

        Customer customer1 = new Customer("vasea", "Masculin", 1684);

        String infoAboutCustomer1 = customer1.toString();
        System.out.println(infoAboutCustomer1);

        customer1.setAge(80);
        System.out.println(customer1.toString());

        customer1.setName("Vasea Lena");
        System.out.println(customer1.toString());

        Customer customer2 = new Customer("lena", "masculin", 20);
        System.out.println(customer2.toString());

        System.out.println("Virsta lui vasea este: " + customer1.getAge());
        System.out.println("Familia lui Vasea este: " + customer1.getName());

        System.out.println(DataGeneratorUtil.getRandomEmail(10, "gmail.com"));
        System.out.println(DataGeneratorUtil.getRandomEmail(10, "gmail.com"));


    }
}
