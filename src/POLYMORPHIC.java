public class POLYMORPHIC {  // 多态
    public static void main(String[] args){
        show(new Cat());
        show(new Dog());
        Animal2 a = new Cat();
        a.eat();
        Cat c = (Cat) a;
        c.work();
    }
    public static  void show(Animal2 a){
        a.eat();
        if(a instanceof  Cat){
            Cat c = (Cat) a;
            c.work();
        }else if( a instanceof  Dog){
            Dog c = (Dog) a;
            c.work();
        }
    }
}

abstract class Animal2 { // 抽象类
    abstract void eat();
}
class Cat extends Animal2 {
    public void eat () {
        System.out.println("吃鱼");
    }
    public void work () {
        System.out.println("抓老鼠");
    }
}

class Dog extends Animal2 {
    public void eat(){
        System.out.println("吃骨头");
    }
    public void work (){
        System.out.println("看家");
    }
}

