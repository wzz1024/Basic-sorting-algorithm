package com.wzz.sortForGithub;
/**
 * @author Wzz
 * 4、堆排序
 * 2017-4-21 下午8:45:52
 */
public class HeapSort {
	//初始化堆，这里是最大堆，即这里进行"筛选"
	public static void initHeap(int[] a,int start,int end){
		int current=start;
		int left=2*current+1;
		int temp=a[current];
		for(;left<=end;current=left,left=2*left+1){
			if(left<end&&a[left]<a[left+1]){
				left++;
			}
			if(a[left]>temp){
				a[current]=a[left];
				a[left]=temp;
			}else{
				break;
			}
		}
	}
	public static void heapSort(int[] a){
		int end=a.length;
		//先初始化堆
		for(int i=end/2-1;i>=0;i--){
			initHeap(a,i,end-1);
		}
		for(int j=end-1;j>0;j--){
			 int temp;
			 temp=a[0];
			 a[0]=a[j];
			 a[j]=temp;
			 for(int i=j/2-1;i>=0;i--){
				 initHeap(a, i, j-1);
			 }
		}
	}
	public static void main(String[] args) {
		int[] a = new int[] { 1, 8, 6, 9, 4, 3, 2, 7, 55, 5 };
		heapSort(a);
		for (int fields : a) {
			System.out.print(fields + " ");
		}
	}

}
