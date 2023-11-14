package md.dimatanasciuc.zooclubservice;

public class Cat extends Animal {
    public Cat(String name){
        super(name);
    }
    public void makeSound(){
        System.out.println("miau ");
    }

    @Override
    public void eat() {
        System.out.println("Pisica maninc peste");
    }
}
