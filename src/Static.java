public class Static {
    public static void main(String[] args) {
            Counter c1 = new Counter();
            Counter c2 = new Counter();
            System.out.println(Counter.count);
    }
}


class Counter {
    public static int count = 0;
    public Counter(){
        count++;
    }
   
}