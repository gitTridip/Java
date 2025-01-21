//   *
//  **
// ***
//****

package programming.pattern;

import java.util.Scanner;

public class Pattern_04 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter n: ");
		int n=sc.nextInt();
		print(n);
		sc.close();
	}
	
	static void print(int n) {
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++)
				if(j>n-i)
					System.out.print("*");
				else
					System.out.print(" ");
			System.out.println();
		}
	}

}
