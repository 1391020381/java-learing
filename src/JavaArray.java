public class JavaArray {
    public static void main(String[] args){
        int [] a = new int[5];
        System.out.println(a[0]);

        a[0] = 100;
        a[1] = 101;
        a[2] = 103;
        a[3] = 120;
        a[4] = 140;
        System.out.println("a:"+a);
        int [] b = new int[]{100,200,300,400};
        System.out.println("b:"+b);
        //int [] c = new int[3]{300,400,500};
       // System.out.println("c:"+c);
    }
}
