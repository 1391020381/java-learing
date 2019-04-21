package Animal;

public class Fish extends Animal implements Pet {
    private String name;
    public void eat(){
        System.out.println("Fish eat");
    }
    public Fish(){
        super(0);
    }
    public void walk(){
      System.out.println("Fish can't walk" + this.legs + "条腿");
    }
    @Override
    public String getName(){
        return this.name;
    }
    @Override
    public void setName(String name){
        this.name = name;
    }
    @Override
    public void play (){
        System.out.println("Fish play");
    }
}
