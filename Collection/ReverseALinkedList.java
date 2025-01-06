package Programming.Collection;

import java.util.Collections;
import java.util.LinkedList;

public class ReverseALinkedList {
	public static void main(String[] args) {
		LinkedList<Object> ll=new LinkedList<Object>();
		ll.add(5);
		ll.add(10);
		System.out.println(ll);
		Collections.reverse(ll);
		System.out.println(ll);
	}
}
