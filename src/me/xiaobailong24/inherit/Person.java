package me.xiaobailong24.inherit;

/**
 * �̳���Ϊ�����ø�����롣������������ IS-A �Ĺ�ϵ�Ϳ���ʹ�ü̳С�
 * 
 * ͬʱ��ʹ�ü̳�ʱ��Ҫ��ס���仰��
 * 
 * 1������ӵ�и���� private �����Ժͷ�����
 * 
 * 2���������ӵ���Լ����Ժͷ�������������ԶԸ��������չ��
 * 
 * 3������������Լ��ķ�ʽʵ�ָ���ķ��������Ժ���ܣ���
 * 
 * @author LiuYinlong
 *
 */
public class Person {

	protected String name;
	protected int age;
	protected String sex;

	public Person(String name) {
		System.out.println("Person Constrctor----" + name);
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected int getAge() {
		return age;
	}

	protected void setAge(int age) {
		this.age = age;
	}

	protected String getSex() {
		return sex;
	}

	protected void setSex(String sex) {
		this.sex = sex;
	}

	public String toString() {
		return "this name is " + name;
	}

}
