package com.ex01;

public class Cat implements AnimalInterface {
	// Member Field/Attribute/Variable
	private String color;
	private String eyeColor;
	private char gender;
	private String kind;
	private int age;
	
	public Cat() {	}
	
	public Cat(String color,String eyeColor,char gender,String kind,int age) {
		this.color=color;
		this.eyeColor=eyeColor;
		this.gender=gender;
		this.kind=kind;
		this.age=age;
	}
	
	
	// Member Method--------------------------------
	public void grooming(String where) {
		System.out.println(where+"그루밍하고있다.");
	}
	
	
	// Override Method-------------------------------

	@Override
	public void eat() {
		System.out.println("밥을 먹는다.");
	}

	@Override
	public void eat(String food) {
		System.out.println(food+"을 먹는다.");
		
	}

	@Override
	public void sleep() {
		System.out.println("잠을 잔다");
		
	}

	@Override
	public void move() {
		System.out.println("움직인다.");
		
	}

}
