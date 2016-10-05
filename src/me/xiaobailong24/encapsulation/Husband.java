package me.xiaobailong24.encapsulation;

/**
 * 封装从字面上来理解就是包装的意思，专业点就是信息隐藏，是指利用抽象数据类型将数据和基于数据的操作封装在一起， 使其构成一个不可分割的独立实体，
 * 数据被保护在抽象数据类型的内部 ，尽可能地隐藏内部的细节，只保留一些对外接口使之与外部发生联系。
 * 
 * 系统的其他对象只能通过包裹在数据外面的已经授权的操作来与这个封装的对象进行交流和交互。
 * 也就是说用户是无需知道对象内部的细节（当然也无从知道），但可以通过该对象对外的提供的接口来访问该对象。
 * 
 * 对于封装而言，一个对象它所封装的是自己的属性和方法，所以它是不需要依赖其他对象就可以完成自己的操作。
 * 
 * 使用封装有三大好处：
 * 
 * 　1、良好的封装能够减少耦合。
 * 
 * 　2、类内部的结构可以自由修改。
 * 
 * 　3、可以对成员进行更精确的控制。
 * 
 * 　4、隐藏信息，实现细节。
 * 
 * @author LiuYinlong
 *
 */
public class Husband {

	/*
	 * 对属性的封装 一个人的姓名、性别、年龄、妻子都是这个人的私有属性
	 */
	private String name;
	private String sex;
	private int age;
	@SuppressWarnings("unused")
	// 男人嘛深屋藏娇妻嘛
	private Wife wife;

	/*
	 * setter()、getter()是该对象对外开放的接口
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		if ("0".equals(sex)) {
			sex = "女";
		} else if ("1".equals(sex)) {
			sex = "男";
		} else {
			sex = "人妖???";
		}
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (age > 120) {
			System.out.println("ERROR: error age input...");
		} else {
			this.age = age;
		}

	}

	public void setWife(Wife wife) {
		this.wife = wife;
	}

}
