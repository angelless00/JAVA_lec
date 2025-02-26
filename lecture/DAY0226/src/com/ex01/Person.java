package com.ex01;

public class Person implements AnimalInterface,FlyInterface{
	// Member Field/Attribute/Variable
		private String name;
		private char gender;
		private int age;
		
		public Person() {	}
		
		public Person(String color,char gender,int age) {
			this.name=name;
			this.gender=gender;
			this.age=age;
		}
		
		// Override Method-------------------------------
		
		@Override
		public void eat() {
			System.out.println("불에 익혀 먹는다.");
		}

		@Override
		public void eat(String food) {
			System.out.println(food+" 예쁘게 플에이팅해서 먹는다.");
			
		}

		@Override
		public void sleep() {			
		}

		@Override
		public void move() {
			System.out.println("주변을 둘러보며 걸어간다 .");
	}
		
		
		
		// - FlyInterface's Override Method------------------

		@Override
		public boolean takeoff(String where) {
			System.out.println(where+"이륙하고 있다.");
			return false;
		}

		@Override
		public void takeoff() {	}

		@Override
		public boolean landing(String where) {
			System.out.println(where+"착륙하고 있다.");
			return false;
		}

		@Override
		public void landing() {	}

		@Override
		public boolean fly(String where) {
			System.out.println(where+"날고 있다.");
			return false;
		}

		@Override
		public void fly() {	}

}
