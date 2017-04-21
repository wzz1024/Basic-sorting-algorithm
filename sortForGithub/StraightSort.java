package com.wzz.sortForGithub;
/**
 * 
 * @author Wzz
 * 1、直接插入排序
 * 2017-4-21 下午8:09:11
 */
public class StraightSort {
	public static void straightSort(int[] a){
		for(int i=1;i<a.length;i++){
			int j=0;
			int temp=a[i];  //首先保留待插入的数a
			for(j=i-1;j>=0;j--){
				 if(a[j]>temp){
					 a[j+1]=a[j];
				 }else{
					 break;
				 }
			}
		   a[j+1]=temp;  //最后插入数a
		}
	}
	public static void main(String[] args) {
		int[] a =new int[]{1,8,6,9,4,3,2,7,55,5};
		straightSort(a);
		for(int fields:a){
			System.out.print(fields+" ");
		}
	}

}
