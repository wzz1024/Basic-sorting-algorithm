package com.wzz.sortForGithub;
/**
 * @author Wzz
 * 6¡¢¿ìËÙÅÅĞò
 * 2017-4-21 ÏÂÎç9:07:15
 */
public class QuickSort {
	public static int quickSort(int[] a,int low,int high){
		int i=low;
		int j=high;
		while(i<j){
			int temp;
			while(i<j&&a[i]<=a[j]){j--;}
			if(i<j){
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				i++;
			}
			while(i<j&&a[i]<=a[j]){i++;}
			if(i<j){
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				j--;
			}
		}
		return i;
	}
	public static void quickSortGo(int[] a,int start,int end){
		if(start<end){
		int pioviate=quickSort(a,start,end);
		quickSortGo(a,start,pioviate-1);
		quickSortGo(a,pioviate+1,end);
		}
	}
	public static void main(String[] args) {
		int[] a = new int[] { 1, 8, 6, 9, 4, 3, 2, 7, 55, 5 };
		quickSortGo(a,0,a.length-1);
		for (int fields : a) {
			System.out.print(fields + " ");
		}
	}

}
