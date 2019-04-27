package charactor;

public class APHero extends Hero implements AP,Mortal {
    String name;
    @Override
    public void magicAttack(){
        System.out.println("进行魔法攻击");
    }
    @Override
    public void die(){
        System.out.println("APHer die");
    }
    public APHero(String name){
        this.name = name;
    }
}
