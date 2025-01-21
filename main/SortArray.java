package programming.main;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
	static int size;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Size of array: ");
		size=sc.nextInt();
		int []arr=new int[size];
		System.out.println("Enter value: ");
		for(int i=0;i<size;i++) {
			System.out.print("a["+i+"] : ");
			arr[i]=sc.nextInt();
			System.out.println();
		}
		sort(arr);
		System.out.println(Arrays.toString(arr));
		sc.close();
	}
	static void sort(int[] arr) {
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				if(arr[i]>arr[j]) {
					int store=arr[j];
					arr[j]=arr[i];
					arr[i]=store;
				}
			}
		}
	}
}
