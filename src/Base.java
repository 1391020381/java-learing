import java.util.Scanner;
public class Base {
    public static void main(String[] args) {
       // 1. 基本数据类型和输出
       int age = 20;
       double score = 98;
       char   grade = 'B';
       String name = "小明";
       System.out.println("姓名:" + name + " 年龄:" + age + " 成绩:" + score + " 等级:" + grade);
       // 2. 使用Scanner获取用户输入
       Scanner scanner = new Scanner(System.in);
       System.out.println("请输入你的数学成绩");
        int mathScore = scanner.nextInt();
       // 3. if-else 判断
       if(mathScore > 90){
        System.out.println("你真棒!");
       }else{
        System.out.println("你真笨!");
       }

       // 4. for 循环
       for(int i = 0; i < 10; i++){
        System.out.println("i = " + i);
       }

       // 5. while 循环
       int j = 0;
       while(j < 10){
        System.out.println("j = " + j);
        j++;
       }

       // 6. do-while 循环
       int k = 0;
       do{
        System.out.println("k = " + k);
        k++;
       }while(k < 10);
       
       // 7. switch-case 判断
       switch((int)mathScore){
        case 90:
        System.out.println("你真棒!");
        break;
        default:
        System.out.println("你真笨!");
        break;
       }
    }
}
