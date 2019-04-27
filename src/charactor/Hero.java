package charactor;
import property.Item;
import property.LifePoint;
import property.MagicPoint;
public  class Hero {
  public   String name ;
    float hp;
    float armor;
    int moveSpeed;
    private static void battleWin(){
        System.out.println("battle win");
    }
    float getArmor(){
        return armor;
    }
    void keng (){
        System.out.println("坑队友！");
    }
    void addSpeed(int speed){
        moveSpeed = moveSpeed + speed;
    }
    void legendary(){
        System.out.println("超神");
    }
    float getHp(){
        return hp;
    }
    void recovery(float blood){
        hp = hp + blood;
    }
    public void useItem(Item i){
        i.effect();
    }
    public void kil(Mortal m){
        m.die();
    }
    public String toString(){
        return name;
    }
    public Hero (){}
    public Hero(String name){
        this.name = name;
    }
    class BattleScore{
        int kill;
        int die;
        int assit;
        public void legendary(){
            if(kill >=8){
                System.out.println(name+ "超神");
            }else {
                System.out.println(name+ "尚未超神");
            }
        }
    }
//    static class EnemyCrystal{
//        int hp = 5000;
//        public void checkIfVictory(){
//            if(hp == 0){
//                    Hero.battleWin();
//                    System.out.println(name+ "win this game");
//            }
//        }
//    }
    public static void main(String[] args){
        Hero garen = new Hero();
        garen.name = "盖伦";
        garen.hp = 616.28f;
        garen.armor = 27.536f;
        garen.moveSpeed =350;
        garen.addSpeed(100);
        System.out.println("moveSpeed:"+ garen.moveSpeed);
        Hero teemo = new Hero();
        teemo.name = "提莫";
        teemo.hp = 383f;
        teemo.armor = 14f;
        teemo.moveSpeed = 330;
        System.out.println("garen:"+ garen);
        System.out.println("teemo:"+teemo);
        BattleScore score = garen.new BattleScore();
        score.kill = 9;
        score.legendary();
        ADHero ad = new ADHero();
        Hero h = ad;
        AD adi = (AD) h;
       // APHero ap = (APHero) adi;
        LifePoint lp = new LifePoint();
        MagicPoint mp = new MagicPoint();
        garen.useItem(lp);
        garen.useItem(mp);
        garen.kil(ad);
    }


}
