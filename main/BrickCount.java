package programming.main;

import java.util.Scanner;

public class BrickCount {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Small Brick Count:");
		int small=sc.nextInt();
		System.out.println("Enter Big Brick Count:");
		int big=sc.nextInt();
		System.out.println("Enter Goal:");
		int limit=sc.nextInt();
		int bcount=0;
		while(big>0 && bcount+5<=limit) {
			bcount=bcount+5;
			big--;
		}
		if((limit-bcount)==0 || (limit-bcount)<=small)
			System.out.println("True");
		else
			System.out.println("False");
		
//		Rakhi bhai logic
//		if(limit/5<=big && limit%5<=small)
//			System.out.println("True");
//		else
//			System.out.println("False");
		
		sc.close();
	}
}
