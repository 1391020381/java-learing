import sun.plugin2.os.windows.OVERLAPPED;

public class Main {

    public static void main(String[] args) {
            Hero garen = new Hero();
            garen.name = "盖伦";
            garen.hp = 616.28f;
            garen.armor = 27.536f;
            garen.moveSpeed = 350;
            System.out.println(garen);
            System.out.println("Hello World!");
            int size = 10;
            double[] myList = new double[size];
            myList[0] = 5.6;
            myList[1] = 4.5;
            double total = 0;
            for(int i =0;i<size;i++){
                total += myList[i];
            }
            System.out.println("总和为："+ total);
            Penguin penguin = new Penguin("penguin",24);
            Mouse mouse = new Mouse("mouse",25);
            penguin.introduction();
            mouse.introduction();
            penguin.move();
            mouse.move();

            Overloading overloading = new Overloading();
            System.out.println(overloading.test());
            overloading.test(2);
            System.out.println(overloading.test(1,"test3"));
            System.out.println(overloading.test("test4",1));

    }
}
