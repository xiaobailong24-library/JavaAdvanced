package me.xiaobailong24.interfaces;

/**
 * ��ʹ�ýӿڹ�������Ҫע�����¼������⣺
 * 
 * 1��1�� Interface �ķ����з�����Ȩ���Զ�������Ϊ public��ȷ�е�˵ֻ��Ϊ public����Ȼ�������ʾ������Ϊ
 * protected��private�����Ǳ�������
 * 
 * 2���ӿ��п��Զ��塰��Ա������������˵�ǲ��ɱ�ĳ�������Ϊ�ӿ��еġ���Ա���������Զ���ΪΪ public static
 * final������ͨ��������ֱ�ӷ��ʣ�ImplementClass.name��
 * 
 * 3���ӿ��в�����ʵ�ֵķ�����
 * 
 * 4��ʵ�ֽӿڵķǳ��������Ҫʵ�ָýӿڵ����з�������������Բ���ʵ�֡�
 * 
 * 5������ʹ�� new ������ʵ����һ���ӿڣ�����������һ���ӿڱ������ñ����������� (refer to) һ��ʵ�ָýӿڵ���Ķ��󡣿���ʹ��
 * instanceof ���һ�������Ƿ�ʵ����ĳ���ض��Ľӿڡ����磺if(anObject instanceof Comparable){}��
 * 
 * 6����ʵ�ֶ�ӿڵ�ʱ��һ��Ҫ���ⷽ�������ظ���
 * 
 * @author LiuYinlong
 *
 */
public interface Animal {
	public void cry();
}
