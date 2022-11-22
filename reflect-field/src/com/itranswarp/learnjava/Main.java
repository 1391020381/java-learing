package com.itranswarp.learnjava;

/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 */
import java.lang.reflect.Field;
public class Main {

	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		String name = "Xiao Ming";
		int age = 20;
		Person p = new Person();
		// TODO: 利用反射给name和age字段赋值:
		Class c = p.getClass();
		 Field f = c.getDeclaredField("name");
		 f.setAccessible(true);
	     f.set(p, "Xiao Hong");
	     Field fAge = c.getDeclaredField("age");
	     fAge.setAccessible(true);
	     fAge.set(p, 20);
		System.out.println(p.getName()); // "Xiao Ming"
		System.out.println(p.getAge()); // 20
	}
}
