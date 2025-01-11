package Programming.Collection;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

import Programming.Src.Employee;

public class StoreEmployeeInReverseOrder {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		TreeSet<Employee> emp=new TreeSet<Employee>(Comparator.reverseOrder());
		int i=0;
		while(i==0) {
			System.out.print("If you want to enter employee details press 0 else if you want to stop press 1: ");
			i=sc.nextInt();
			if(i==0) {
				System.out.print("Name: ");
				String name=sc.next();
				System.out.print("Id: ");
				int id=sc.nextInt();
				System.out.print("Salary: ");
				int sal=sc.nextInt();
				System.out.print("Age: ");
				int age=sc.nextInt();
				emp.add(new Employee(name, id, sal, age));
			}
			else if(i>1) {
				System.out.println("Inavalid input");
				i=0;
			}
		}
		for(Employee e:emp) {
			System.out.println(e);
		}
		sc.close();
	}
}
