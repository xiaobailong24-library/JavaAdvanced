package me.xiaobailong24.encapsulation;

/**
 * ��װ���������������ǰ�װ����˼��רҵ�������Ϣ���أ���ָ���ó����������ͽ����ݺͻ������ݵĲ�����װ��һ�� ʹ�乹��һ�����ɷָ�Ķ���ʵ�壬
 * ���ݱ������ڳ����������͵��ڲ� �������ܵ������ڲ���ϸ�ڣ�ֻ����һЩ����ӿ�ʹ֮���ⲿ������ϵ��
 * 
 * ϵͳ����������ֻ��ͨ������������������Ѿ���Ȩ�Ĳ������������װ�Ķ�����н����ͽ�����
 * Ҳ����˵�û�������֪�������ڲ���ϸ�ڣ���ȻҲ�޴�֪������������ͨ���ö��������ṩ�Ľӿ������ʸö���
 * 
 * ���ڷ�װ���ԣ�һ������������װ�����Լ������Ժͷ������������ǲ���Ҫ������������Ϳ�������Լ��Ĳ�����
 * 
 * ʹ�÷�װ������ô���
 * 
 * ��1�����õķ�װ�ܹ�������ϡ�
 * 
 * ��2�����ڲ��Ľṹ���������޸ġ�
 * 
 * ��3�����ԶԳ�Ա���и���ȷ�Ŀ��ơ�
 * 
 * ��4��������Ϣ��ʵ��ϸ�ڡ�
 * 
 * @author LiuYinlong
 *
 */
public class Husband {

	/*
	 * �����Եķ�װ һ���˵��������Ա����䡢���Ӷ�������˵�˽������
	 */
	private String name;
	private String sex;
	private int age;
	@SuppressWarnings("unused")
	// ���������ݲؽ�����
	private Wife wife;

	/*
	 * setter()��getter()�Ǹö�����⿪�ŵĽӿ�
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		if ("0".equals(sex)) {
			sex = "Ů";
		} else if ("1".equals(sex)) {
			sex = "��";
		} else {
			sex = "����???";
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
