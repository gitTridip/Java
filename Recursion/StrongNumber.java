package programming.recursion;

import java.util.Scanner;

public class StrongNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String lim=null;
		int low;
		int high;
		while(true) {
			System.out.print("Enter range of number (use blank space between two limit): ");
			lim=sc.nextLine();
			String[] split = lim.split(" ");
			if(split.length!=2)
				System.out.println("Invalid input");
			else {
				try {
					low=Integer.parseInt(split[0]);
					if(low<=0) 
						low=1;
					high=Integer.parseInt(split[1]);
					break;
				} catch (Exception e) {
					System.out.println("Invalid input");
				}
			}
		}
		for(int i=low;i<=high;i++) {
			if(i==check(i))
				System.out.print(i+" ");
		}
		sc.close();
	}	
	
	static int check(int num) {
		if(num>0)
			return fact(num%10)+check(num/10);
		return 0;
	}
	
	static int fact(int digit) {
		if(digit>=1)
			return digit*fact(digit-1);
		return 1;
	}
}
