package me.xiaobailong24.collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		/**
		 * 定义
		 */
		HashSet<String> hs = new HashSet<>();

		/**
		 * 添加元素
		 */
		for (int i = 0; i < 10; i++) {
			hs.add("" + i);
		}

		/**
		 * 查找元素(通过迭代器)
		 */
		System.out.println("size: " + hs.size());
		Iterator<String> iter = hs.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		/**
		 * 清空
		 */
		hs.clear();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}

}
