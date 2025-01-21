//****
//*  *
//*  *
//****

package programming.pattern;

import java.util.Scanner;

public class Pattern_06 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n: ");
		int n=sc.nextInt();
		print(n);
		sc.close();
	}
	static void print(int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(i==0 || i==n-1)
					System.out.print("*");
				else if(j==0 || j==n-1)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}
