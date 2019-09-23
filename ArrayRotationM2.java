package com.practice;

class Internal{
	
	public int[] arrayRotation(int arr[], int n){
		int temp=0;
		temp=arr[0];
		for(int i=0;i<n-1;i++){
			
			arr[i]=arr[i+1];
		}
		arr[n-1]=temp;
		return arr;
	}
	
}



public class ArrayRotationM2 {

	public static void main(String[] args) {
		int arr[]={1,2,3,4,5,6};
		int n=arr.length;
		int m=4;
		
		Internal obj = new Internal();
		
		int arr2[]={0};
		
		for(int j=0;j<m;j++)
		arr2=obj.arrayRotation(arr, n);
		
		for(int i=0;i<arr2.length;i++)
			System.out.println(arr2[i]);
		
		
		
	}

}
