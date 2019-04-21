package charactor;

public class Support extends Hero implements Healer {
    @Override
    public void heal(){
        System.out.println("治疗");
    }
    public static void  main(String[] args){
        Support support = new Support();
        support.heal();
    }
}
