//* * * * 
//* * * 
//* * 
//*
package programming.pattern;

import java.util.Scanner;

public class Pattern_03 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n: ");
		int n=sc.nextInt();
		print(n);
		sc.close();
	}
	static void print(int n) {
		for(int i=0;i<n;i++) {
			for(int j=n-i;j>0;j--)
				System.out.print("* ");
			System.out.println();
		}
	}

}
