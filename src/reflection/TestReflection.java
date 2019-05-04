package reflection;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import charactor.Hero;
public class TestReflection {
    public static void main(String[] args){
        Hero h1 = new Hero();
        h1.name = "teemo";
        System.out.println(h1);
        String className = "charactor.Hero";
        try{
            Field f1 = h1.getClass().getDeclaredField("name");
            f1.set(h1,"teemo2322323233");
            System.out.println(h1.name);
            Method m = h1.getClass().getMethod("setName", String.class);
            m.invoke(h1,"盖伦");
            System.out.println(h1.getName());
        }catch (Exception e){
            e.printStackTrace();
        }
        try{
            Class pClass1 = Class.forName(className);
            Class pClass2 = Hero.class;
            Class pClass3 = new Hero().getClass();
            System.out.println("class:"+ pClass1);
            System.out.println(pClass1 == pClass2);
            System.out.println(pClass1 == pClass3);

            Constructor c = pClass1.getConstructor();
            Hero h2 = (Hero) c.newInstance();
            h2.name = "gareen";
            System.out.println(h2);
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
