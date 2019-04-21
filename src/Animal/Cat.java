package Animal;

public class Cat extends Animal implements Pet{
    String name;
    public Cat(String name){
        super(4);
        this.name =name;
    }
    public Cat(){
        this(""); // 调用其他构造函数
    }
    public void eat(){
        System.out.println("Cat eat");
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
    public void play(){
        System.out.println("Cat play");
    }
}
