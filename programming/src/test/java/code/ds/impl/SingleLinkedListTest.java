package code.ds.impl;

import static org.junit.Assert.*;

import org.junit.Test;

public class SingleLinkedListTest {

	@Test
	public void test() {
		SingleLinkedList sl =new SingleLinkedList();
		sl.append(new Node(1));
		sl.append(new Node(2));
		sl.append(new Node(3));
		sl.append(new Node(4));
		sl.print();
		sl.reverseLinkedList();
		sl.print();
	}

}
