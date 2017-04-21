package com.wzz.sortForGithub;
/**
 * @author Wzz
 * 7、归并排序
 * 2017-4-21 下午9:27:40
 */
public class MergeSort {
	//先归并
	public static void merge(int[] a,int low,int mid,int high){
		int i=low;
		int j=mid+1;
		int k=0;
		int[] temp=new int[high-low+1]; 
	    while(i<=mid&&j<=high){
	    	if(a[i]<a[j]){
	    		temp[k++]=a[i++];
	    	}else{
	    		temp[k++]=a[j++];
	    	}
	    }
	    while(i<=mid){temp[k++]=a[i++];}
	    while(j<=high){temp[k++]=a[j++];}
	    for(int k1=0;k1<temp.length;k1++){
	    	a[k1+low]=temp[k1];
	    }
	}
	public static void mergeSort(int[] a,int low,int high){
		int mid=(low+high)/2;
		if(low<high){
			mergeSort(a,low,mid);
			mergeSort(a,mid+1,high);
			merge(a,low,mid,high);
		}
	}
	public static void main(String[] args) {
		int[] a = new int[] { 1, 8, 6, 9, 4, 3, 2, 7, 55, 5 };
		mergeSort(a,0,a.length-1);
		for (int fields : a) {
			System.out.print(fields + " ");
		}
	}

}
