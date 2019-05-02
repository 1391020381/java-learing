package property;

public abstract  class Item {
    String name;
    int price;
    public void buy(){
        System.out.println("购买");
    }
    public void effect(){
        System.out.println("购买使用后,可以有效果");
    }
    public abstract boolean disposable();
    public static void main(String[] args){
        Item i1 = new LifePoint(555);
        Item i2 = new MagicPoint();
        System.out.println("i1 是Item类型,执行effect打印：");
        i1.effect();
        System.out.println("i2也是Item类型，执行effect打印：");
        i2.effect();
    }
}
