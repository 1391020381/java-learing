package com.itranswarp.world;

public class Student extends Person {
	private double score;
	public Student(String name,double score) {
		super(name);
		this.score = score;
	}
	public double getScore() {
		return this.score;
	}
}
