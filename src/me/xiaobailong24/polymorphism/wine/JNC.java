package me.xiaobailong24.polymorphism.wine;

public class JNC extends Wine {

	/**
     * @desc �������ظ��෽��
     *        �����в����ڸ÷���������ת�ͺ󣬸����ǲ������ø÷�����
     * @param a
     * @return void
     */
	public void func1(String a) {
		System.out.println("JNC �� Fun1...");
		fun2();
	}

	 /**
     * ������д���෽��
     * ָ������ĸ������õ���fun2ʱ���ض��ǵ��ø÷���
     */
	@Override
	public void fun2() {
		System.out.println("JNC �� Fun2...");
	}

}
