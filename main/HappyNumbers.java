package programming.main;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class HappyNumbers {
	static LinkedHashSet<Integer> numberSet=new LinkedHashSet<Integer>();
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
					high=Integer.parseInt(split[1]);
					break;
				} catch (Exception e) {
					System.out.println("Invalid input");
				}
			}
		}
		for(int i=low;i<=high;i++) {
			numberSet.clear();
			if(check(i))
				System.out.print(i+" ");
		}
//		else
//			System.out.println("Not a happy number");
		sc.close();
	}
	static boolean check(int num) {
		if(numberSet.contains(num))
			return false;
		else if(num==1) 
			return true;
		else {
			numberSet.add(num);
			return check(newNum(num));
		}
	}
	static int newNum(int num) {
		if(num!=0)
			return pow(num%10)+newNum(num/10);
		else
			return 0;
	}
	static int pow(int num) {
		return num*num;
	}
}
