package me.xiaobailong24.polymorphism.inherit;

public class JNCInherit extends WineInherit {

	public JNCInherit() {
		setName("JNCInherit");
	}

	/**
	 * ��д���෽����ʵ�ֶ�̬
	 */
	@Override
	public String drink() {
		return "�ȵ��� "+getName();
	}

	/**
	 * ��дtoString()
	 */
	@Override
	public String toString() {
		return "Wine : "+getName();
	}


	
	
}
