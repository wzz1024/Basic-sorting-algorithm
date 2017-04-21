package com.wzz.sortForGithub;
/**
 * @author Wzz
 * 8�����������������ɼ�����
 * 2017-4-21 ����9:47:36
 */
public class BinarySortTree {
	 static Node root;
	public static void insert(int data){
		root=insert(root,data);
	}
	public static Node insert(Node node,int data){
		if(node==null){
			node=new Node(data);
		}else{
			if(data<=node.data){
				node.left=insert(node.left,data);
			}else{
				node.right=insert(node.right,data);
			}
		}
		return node;
	}
	
   //��������������  1.�������Ϊ����
	public static void printTree(){
		printTree(root);
	}
	public static void printTree(Node node){
		if(node!=null){
			printTree(node.left);
			System.out.print(node.data+" ");
			printTree(node.right);
		}
	}
	public static void main(String[] args) {
		int[] a = new int[] { 1, 8, 6, 9, 4, 3, 2, 7, 55, 5 };
		for(int i=0;i<a.length;i++){
			insert(a[i]);
		}
		printTree();
	}

}
