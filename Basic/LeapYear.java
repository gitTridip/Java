package programming.basic;

import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter year: ");
		int year=sc.nextInt();
		System.out.println(check(year));
		sc.close();
	}

	static boolean check(int year) {
		if((year%100!=0 && year%4==0)|| year%400==0)
			return true;
		else
			return false;
	}
}
