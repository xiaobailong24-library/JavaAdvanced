package me.xiaobailong24.collection.list;

import java.util.ArrayList;

/**
 * 一、ArrayList 概述
 * 
 * ArrayList 是实现 List 接口的动态数组，所谓动态就是它的大小是可变的。实现了所有可选列表操作，并允许包括 null 在内的所有元素。除了实现
 * List 接口外，此类还提供一些方法来操作内部用来存储列表的数组的大小。
 * 
 * 每个 ArrayList 实例都有一个容量，该容量是指用来存储列表元素的数组的大小。默认初始容量为 10。随着 ArrayList
 * 中元素的增加，它的容量也会不断的自动增长。在每次添加新的元素时，ArrayList
 * 都会检查是否需要进行扩容操作，扩容操作带来数据向新数组的重新拷贝，所以如果我们知道具体业务数据量，在构造 ArrayList 时可以给 ArrayList
 * 指定一个初始容量，这样就会减少扩容时数据的拷贝问题。当然在添加大量元素前，应用程序也可以使用 ensureCapacity 操作来增加 ArrayList
 * 实例的容量，这可以减少递增式再分配的数量。
 * 
 * 注意，ArrayList 实现不是同步的。如果多个线程同时访问一个 ArrayList
 * 实例，而其中至少一个线程从结构上修改了列表，那么它必须保持外部同步。所以为了保证同步，最好的办法是在创建时完成，以防止意外对列表进行不同步的访问：
 * 
 * List list = Collections.synchronizedList(new ArrayList(…))
 * 
 * @author LiuYinlong
 *
 */
public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		System.out.println("a的大小为：" + a.size());

		/*
		 * 添加元素
		 */
		a.add(0);
		a.add(1, 1);
		a.add(2, 1);
		a.add(3);
		a.add(4, 4);

		for (Integer integer : a) {
			System.out.print(integer + ",");
		}
		System.out.println();

		/**
		 * 删除元素
		 */
		a.remove(1); // 移除此列表中指定位置上的元素。
		for (Integer integer : a) {
			System.out.print(integer + ",");
		}
		System.out.println();
		Integer i = new Integer(1);
		a.remove(i); // 移除此列表中首次出现的指定元素（如果存在）。
		for (Integer integer : a) {
			System.out.print(integer + ",");
		}
		System.out.println();

		/**
		 * 查找元素
		 */
		System.out.println("2:" + a.get(2));

		boolean j = true;
		while (j) {
			a.add(i++);
			if (i > 10) {
				j = false;
			}
		}
		for (Integer integer : a) {
			System.out.print(integer + ",");
		}
		System.out.println();
	}

}
