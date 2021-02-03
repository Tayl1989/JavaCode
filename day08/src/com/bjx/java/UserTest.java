package com.bjx.java;

public class UserTest {
	public static void main(String[] args) {
		User u1 = new User();
		System.out.println(u1.name);
		System.out.println(u1.age);
		System.out.println(u1.isMale);
		
		u1.talk("日语");
	}
}
class User{
	String name;
	int age;
	boolean isMale;

	public void talk(String language) {
		System.out.println("我们使用" + language + "进行交流");
	}
	
	public void eat() {
		String food = "烙饼";//局部变量
		System.out.println("北方人喜欢吃：" + food);
	}
}
