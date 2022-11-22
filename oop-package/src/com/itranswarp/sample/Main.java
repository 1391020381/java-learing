package com.itranswarp.sample;

import com.itranswarp.world.Person;
import com.itranswarp.world.Student;
/**
 * Learn Java from https://www.liaoxuefeng.com/
 * 
 * @author liaoxuefeng
 */
public class Main {

	public static void main(String[] args) {
		Person p1 = new Person("小明");
		System.out.println(p1.hello());
		Student s1 = new Student("小明",90);
		System.out.println(s1.getScore());
	}

}
