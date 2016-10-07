package me.xiaobailong24.sort.select;

/**
 * 简单的选择排序
 * 
 * 基本思想：在要排序的一组数中，选出最小的一个数与第一个位置的数交换；然后在剩下的数当中再找最小的与第二个位置的数交换，
 * 如此循环到倒数第二个数和最后一个数比较为止。
 * 
 * @author LiuYinlong
 *
 */
public class SimpleSelect {

	public static void main(String[] args) {
		int[] a = { 49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 1, 8 };
		System.out.println("排序之前：");
		for (int i : a) {
			System.out.print(i + " ");
		}
		System.out.println();

		// 简单的选择排序
		simpleSelect(a);

		System.out.println("排序之后：");
		for (int i : a) {
			System.out.print(i + " ");
		}

	}

	private static void simpleSelect(int[] a) {
		for (int i = 0; i < a.length; i++) {
			int min = a[i];
			int n = i; // 最小数的索引
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < min) { // 找出最小的数
					min = a[j];
					n = j;
				}
			}
			a[n] = a[i];
			a[i] = min;
		}
	}

}
