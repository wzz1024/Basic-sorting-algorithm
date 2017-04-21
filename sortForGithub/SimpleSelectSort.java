package com.wzz.sortForGithub;

/**
 * 
 * @author Wzz
 * 3°¢ºÚµ•—°‘Ò≈≈–Ú
 * 2017-4-21 œ¬ŒÁ8:42:20
 */
public class SimpleSelectSort {
    public static void simpleSelectSort(int[] a){
    	for(int i=0;i<a.length-1;i++){
    		int temp;
    		int min=a[i];
    		int k=i;
    		for(int j=i+1;j<a.length;j++){
    			 if(a[j]<min){
    				 min=a[j];
    				 k=j;
    			 }
    		}
    		temp=a[i];
    		a[i]=a[k];
    		a[k]=temp;
    	}
    }
	public static void main(String[] args) {
		int[] a = new int[] { 1, 8, 6, 9, 4, 3, 2, 7, 55, 5 };
		simpleSelectSort(a);
		for (int fields : a) {
			System.out.print(fields + " ");
		}
	}

}
