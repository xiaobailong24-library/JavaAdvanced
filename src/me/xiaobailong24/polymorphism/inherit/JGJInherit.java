package me.xiaobailong24.polymorphism.inherit;

public class JGJInherit extends WineInherit {

	public JGJInherit() {
		super.setName("JGJInherit");
	}
	/**
	 * ��д���෽����ʵ�ֶ�̬
	 */

	@Override
	public String drink() {
		return "�ȵ��� "+getName();
	}

	@Override
	public String toString() {
		return "Wine : "+getName();
	}

}
