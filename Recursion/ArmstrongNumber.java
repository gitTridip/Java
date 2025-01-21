package programming.recursion;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number: ");
		int num=sc.nextInt();
		int copy=num;
		int digit=0;
		while(copy!=0) {
			digit=digit+1;
			copy=copy/10;
		}
		if(num>0 && check(num,digit)==num)
			System.out.println("Armstrong number");
		else
			System.out.println("Not an armstrong number");
		sc.close();
	}

	static int check(int num,int digit) {
		if(num!=0)
			return pow(num%10,digit)+check(num/10,digit);
		return 0;
	}

	static int pow(int num, int digit) {
		if(digit>=1)
			return num*pow(num,digit-1);
		return 1;
	}
}
