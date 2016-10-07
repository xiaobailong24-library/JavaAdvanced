package me.xiaobailong24.sort.insert;

public class HillSort {

	/**
	 * 希尔排序
	 * 
	 * 基本思想：先取一个小于 n 的整数 d1 作为第一个增量，把文件的全部记录分成 d1 个组。所有距离为 d1
	 * 的倍数的记录放在同一个组中。先在各组内进行直接插入排序；然后，取第二个增量 d2<d1 重复上述的分组和排序，直至所取的增量 dt=1(dt<dt
	 * -l<…<d2<d1)，即所有记录放在同一组中进行直接插入排序为止。该方法实质上是一种分组插入方法。
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a = { 49, 38, 65, 97, 76, 13, 27, 49, 78, 34, 12, 64, 1 };
		System.out.println("排序之前：");
		for (int i : a) {
			System.out.print(i + " ");
		}
		System.out.println();

		// 希尔排序
		hillSort(a);

		System.out.println("排序之后：");
		for (int i : a) {
			System.out.print(i + " ");
		}
	}

	private static void hillSort(int[] a) {
		int length = a.length;
		while (true) {
			length = length / 2;
			for (int x = 0; x < length; x++) {
				for (int i = x + length; i < a.length; i = i + length) {
					int temp = a[i];
					int j;
					for (j = i - length; j >= 0 && a[j] > temp; j = j - length) {
						a[j + length] = a[j];
					}
					a[j + length] = temp;
				}
			}
			if (length == 1) {
				break;
			}
		}

	}

}
