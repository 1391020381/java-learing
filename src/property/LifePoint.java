package property;

public class LifePoint extends Item{
    String name;
    int price;
    Number lifePoint;
    public void buy(){
        System.out.println("购买");
    }
    public void effect(){
        System.out.println("血瓶使用后,可以回血");
    }

    @Override
    public boolean disposable() {
        return true;
    }
    public LifePoint(Number lifePoint){
        this.lifePoint = lifePoint;
    }
}
