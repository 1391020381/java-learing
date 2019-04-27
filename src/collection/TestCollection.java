package collection;
import java.util.ArrayList;
import java.util.List;
import charactor.Hero;
import charactor.APHero;
import charactor.Hero;
import property.LifePoint;
public class TestCollection {
    @SuppressWarnings("rawtypes")
    public static void main (String[] args){
//        Hero heros[] = new Hero[10];
//        heros[0] = new Hero("盖伦");
//        System.out.println(heros);
//        ArrayList heros1 = new ArrayList();
//        heros1.add(new Hero("盖伦"));
//        System.out.println(heros1.size());
    //    List<Hero> hero = new ArrayList<Hero>();
        List<Object> heros= new ArrayList<Object>();
        heros.add(new Hero("盖伦"));
        heros.add(new APHero("提莫"));
      heros.add(new LifePoint(300));
    }
}
