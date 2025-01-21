package programming.recursion;

import java.util.Scanner;

public class SumAndProductOfNaturalNumbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter limit:");
		int lim=sc.nextInt();
		System.out.println("Sum= "+sum(lim));
		System.out.println("Product= "+prod(lim));
		sc.close();
	}

	static int prod(int lim) {
		if(lim>1)
			lim=lim*prod(lim-1);
		return lim;
	}

	static int sum(int lim) {
		if(lim>0)
			lim=lim+sum(lim-1);
		return lim;
	}
}
