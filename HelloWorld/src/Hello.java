
/**
 * 整数类型  byte  short int long
 * 浮点数类型  float  double
 * 字符串类型  char
 * 布尔类型  boolean
 * 
 * 引用类型 String s = "hello"
 * 常量 final 
 * var 关键字 编译器会根据赋值语句自动推断变量类型
 * 变量的作用范围  在java中多行语句用 {} 括起来。 都以 {}作为它们自身的范围。
 * 数组  int[] nsArr = {68,79,91,85,62};
 * **/
public class Hello {
   public static void main(String[] args) {
	   int x = 100;
	   System.out.println(x);
	   x = 200;
	   System.out.println(x);
	   String s = "first line \n" 
			   + "second line \n"
			   + "end";
	   System.out.println(s instanceof String);
	   System.out.println(s);
	   int[] ns = new int[5];
	   ns[0] = 68;
	   ns[1] = 79;
	   ns[2] = 91;
	   ns[3] = 85;
	   ns[4] = 62;
	   System.out.println(ns[0]);
	   int[] nsArr = {68,79,91,85,62};
	   System.out.println(nsArr.getClass().isArray());
	   System.out.print("A,");
	   System.out.print("B,");
	   System.out.println("C.");
	   int n = 70;
	   if(n>=60) {
		   System.out.println("及格了");
	   }else {
		   System.out.println("很遗憾,没有及格");
	   }
   }
}
