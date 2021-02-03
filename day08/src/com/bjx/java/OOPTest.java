package com.bjx.java;

public class OOPTest {
	public static void main(String[] args) {
		//创建person类的对象
		Person p1 = new Person();
		
		//调用对象的结构：属性、方法
		//调用属性：“对象.属性”
		p1.name = "Tom";
		p1.isMale = true;
		System.out.println(p1.name);
		
		//调用方法：“对象.方法”
		p1.eat();
		p1.sleep();
		p1.talk("Chinese");
		
		Person p2 = new Person();
		System.out.println(p2.name);
		System.out.println(p2.isMale);
		
		Person p3 = p1;
		System.out.println(p3.name);
		
		p3.age = 10;
		System.out.println(p1.age);
	}
}

class Person{
	
	//属性
	String name;
	int age = 1;
	boolean isMale;
	
	//方法：
	public void eat() {
		System.out.println("吃饭");
	}
	
	public void sleep() {
		System.out.println("睡觉");
	}
	
	public void talk(String language) {
		System.out.println("说话使用的是：" + language);
	}
}