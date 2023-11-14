package md.dimatanasciuc.zooclubservice;

public class Dog extends Animal{

    private boolean hasAGoodLife;
    public Dog(String nameOfTheDog, boolean hasAGoodLife){
        super(nameOfTheDog);
        this.hasAGoodLife = hasAGoodLife;
    }

    public Dog(String nameOfTheDog){
        super(nameOfTheDog);

    }

    public void makeSound(){
        System.out.println("gav gav");
    }
    @Override
    public void eat() {
        System.out.println("Ciinele maninca pedigree");
    }
    public String getName(){
        return this.name + "This is from child class";
    }
}
