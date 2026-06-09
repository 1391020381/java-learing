public class Interface {
    public static void main(String[] args) {
       
    }
}


interface Person {
    void run ();
    String getName();
}

class Student implements Person {
    private String name;
    @Override
    public void run() {
        System.out.println("学生跑步");
    }
    @Override
    public String getName() {
        return "学生";
    }
}