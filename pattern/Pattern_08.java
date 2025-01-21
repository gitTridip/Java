//  *  
//  *  
//*****
//  *  
//  *  


package programming.pattern;

import java.util.Scanner;

public class Pattern_08 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n(odd number): ");
		int n=sc.nextInt();
		if(n%2==0)
			n++;
		print(n);
		sc.close();
	}
	static void print(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==n/2+1 || j==n/2+1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
