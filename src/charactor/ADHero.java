package charactor;

public class ADHero extends Hero implements AD,Mortal {
    @Override
    public void physicAttack(){
        System.out.println("进行物理攻击");
    }
    @Override
    public void die(){
        System.out.println("ADHer die");
    }
}
