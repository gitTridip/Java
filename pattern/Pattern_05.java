//*****
// ****
//  ***
//   **
//    *
//   **
//  ***
// ****
//*****


package programming.pattern;

import java.util.Scanner;

public class Pattern_05 {
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
		for(int i=0;i<n;i++) {
			for(int j=n-1;j>=0;j--)
				if(j<n-i)
					System.out.print("*");
				else
					System.out.print(" ");
			System.out.println();
		}
		for(int i=n-1;i>0;i--) {
			for(int j=1;j<=n;j++) {
				if(j>i-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
