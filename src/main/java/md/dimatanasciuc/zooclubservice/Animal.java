package md.dimatanasciuc.zooclubservice;

public abstract class Animal implements AnimalInterface {
    protected String name;

    public Animal(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public abstract void eat();
}
