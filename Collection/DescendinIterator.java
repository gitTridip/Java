package programming.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class DescendinIterator {
	public static void main(String[] args) {
		ArrayList<Object> al=new ArrayList<Object>();
		al.add(null);
		al.add(5);
		al.add("hi");
		LinkedList<Object> ll=new LinkedList<Object>(al);
		Iterator<Object> i=ll.descendingIterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}
}
