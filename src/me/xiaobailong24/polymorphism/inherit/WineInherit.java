package me.xiaobailong24.polymorphism.inherit;

/**
 * Java ʵ�ֶ�̬��������Ҫ�������̳С���д������ת�͡�
 * 
 * �̳У��ڶ�̬�б�������м̳й�ϵ������͸��ࡣ
 * 
 * ��д������Ը�����ĳЩ�����������¶��壬�ڵ�����Щ����ʱ�ͻ��������ķ�����
 * 
 * ����ת�ͣ��ڶ�̬����Ҫ����������ø����������ֻ�����������ò��ܹ��߱����ܵ��ø���ķ���������ķ�����
 * 
 * 2.2.1.���ڼ̳�ʵ�ֵĶ�̬
 * 
 * ���ڼ̳е�ʵ�ֻ�����Ҫ�����ڸ���ͼ̳иø����һ�����������ĳЩ��������д����������ͬһ��������д���Ա��ֳ���ͬ����Ϊ��
 * 
 * @author LiuYinlong
 *
 */
public class WineInherit {
	private String name;

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	public WineInherit() {
	}

	public String drink() {
		return "�ȵ��� " + getName();
	}

	/**
	 * ��дtoString()
	 */
	public String toString() {
		return null;
	}

}
