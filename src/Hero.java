public class Hero {
    String name;
    float hp;
    float armor ;
    int moveSpeed;
    public static void main (String[] args){
        Hero garen = new Hero();
        garen.name = "盖伦";
        garen.hp = 616.28f;
        garen.armor = 27.536f;
        garen.moveSpeed = 350;
        System.out.println(garen);
    }
}
