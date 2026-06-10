import java.util.List;

public class Reflection {
    public static void main(String[] args) {
        // Java 反射机制允许程序在运行时获取任意类的内部信息(如构造器 方法 字段 注解) 并能动态创建对象 调用方法 修改字段值，而不需要再编译期明确知道类的具体类型。
        // 反射获取类信息并调用方法
        try {
            Class<?> clazz = Class.forName("java.util.ArrayList");
            List list = (List) clazz.getDeclaredConstructor().newInstance();
            list.add(1);
            list.add(2);
            list.add(3);
            System.out.println(list); // [Hello]
        } catch (Exception e) {
            e.printStackTrace();    
        }
    }
}
