package me.xiaobailong24.polymorphism.sample;

/**
 * ������������ñ��������������ʱ�������ö�������Ͷ��������ñ��������;����˵���˭�ĳ�Ա������������������õķ����������ڳ����ж�����ģ�
 * Ҳ����˵�����า�ǵķ�������仰�Զ�̬������һ��������
 * 
 * ��ʵ�ڼ̳����ж��󷽷��ĵ��ô���һ�����ȼ���this.show(O)��super.show(O)��this.show((super)O)��super.
 * show((super)O)��
 * 
 * @author LiuYinlong
 *
 */
public class Test {

	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new B();
		B b = new B();
		C c = new C();
		D d = new D();

		System.out.println("1--" + a1.show((A) b)); // "A and A"
		System.out.println("2--" + a1.show((A) c)); // "A and A"
		System.out.println("3--" + a1.show((D) d)); // "A and D"

		System.out.println("4--" + a2.show((A) b)); // "A and A"
		System.out.println("5--" + a2.show((A) c)); // "A and A"
		System.out.println("6--" + a2.show((D) d)); // "A and D"

		System.out.println("7--" + b.show((B) b)); // "B and B"
		System.out.println("8--" + b.show((B) c)); // "B and B"
		System.out.println("9--" + b.show((D) d)); // "A and D"
	}

}
