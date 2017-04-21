package com.wzz.sortForGithub;
/**
 * @author Wzz
 * 5║╒ц╟ещеепР
 * 2017-4-21 обнГ9:03:17
 */
public class BubbleSort {
	public static void bubbleSort(int[] a){
		for(int i=0;i<a.length-1;i++){
			for(int j=1;j<a.length-i;j++){
				int temp;
				if(a[j]<a[j-1]){
					temp=a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		int[] a = new int[] { 1, 8, 6, 9, 4, 3, 2, 7, 55, 5 };
		bubbleSort(a);
		for (int fields : a) {
			System.out.print(fields + " ");
		}
	}

}
