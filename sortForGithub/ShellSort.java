package com.wzz.sortForGithub;

/**
 * 
 * @author Wzz 
 * 2¡¢Ï£¶ûÅÅÐò 
 * 2017-4-21 ÏÂÎç8:19:42
 */
public class ShellSort {
	public static void shellSort(int[] a) {
		int size = a.length;
		for (int i = size / 2; i > 0; i /= 2) {
			for (int j = i; j < size; j++) {
				for (int k = j - i; k >= 0; k -= i) {
					int temp;
					if (a[k] > a[k + i]) {
						temp = a[k];
						a[k] = a[k + i];
						a[k + i] = temp;
					}
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] a = new int[] { 1, 8, 6, 9, 4, 3, 2, 7, 55, 5 };
		shellSort(a);
		for (int fields : a) {
			System.out.print(fields + " ");
		}
	}

}
