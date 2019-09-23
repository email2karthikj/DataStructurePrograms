package com.practice;

import java.util.ArrayList;

public class ArrayRotationM1 {

	//int temp[]={0};
	//int temp2[]={0};
	
	public static void main(String[] args) {
		
		int arr[]={1,2,3,4,5,6};
		ArrayList temp = new ArrayList();
		ArrayList temp2 = new ArrayList();
		int i=0,j=0,m=5,c=0;
		
		for(i=0;i<m;i++){
			temp.add(arr[i]);
		}
		
		//System.out.println(temp);
		
		
		
		for(j=m;j<arr.length;j++){
			temp2.add(arr[j]);
			c++;
		}
		i=0;
		for(int d=c;d<arr.length;d++){
			temp2.add(temp.get(i));
			i++;
		}
		
		System.out.println(temp2);
		
		
	}

}
