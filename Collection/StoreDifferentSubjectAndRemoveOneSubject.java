package Programming.Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class StoreDifferentSubjectAndRemoveOneSubject {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LinkedHashSet<String> lhs=new LinkedHashSet<String>();
		
		System.out.print("Enter how many subject you want to enter: ");
		int vol=sc.nextInt();
		
		for(int i=0;i<vol;i++) {
			System.out.print("Subject "+(i+1)+": ");
			lhs.add(sc.next());
		}
		
		System.out.println("Which subject you want to remove?");
		String subject=sc.next();
		
		Iterator<String> i=lhs.iterator();
		while(i.hasNext()) {
			String s=i.next();
			if(s.equals(subject)) {
				i.remove();
				break;
			}
		}
		
		System.out.println(lhs);
		sc.close();
	}

}
