package com.alltasks;

//array of elements count of 2 in given array list
public class Taska44arrelecountof2 {

	public static void main(String[] args) {
		int count=0;

		int[] arr = { 12, 2332, 45, 42, 35, 6272, 8227, 2, 222,222  };
for(int i=0;i<arr.length;i++) {
	 System.out.print(arr[i]+" ");
	while(arr[i]!=0) {
		int t=arr[i]%10;
		arr[i]/=10;
		if(t==2) {
		count++;
	}}
	
}
System.out.println();
	System.out.println("count 2's in given array:"+count);	
	}

}
