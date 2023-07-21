package com.digit.testProj.CollectionFramework;
import java.util.HashSet;
import java.util.LinkedHashSet;
public class ArrayList1 {
public static void main(String[] args) {
	/*ArrayList al=new ArrayList();
	//add
	al.add(100);
	al.add("kirupa");
	al.add(-5);
	System.out.println(al);
	al.add(0,200);
	System.out.println(al);
	ArrayList a2=new ArrayList();
	a2.addAll(al);
	System.out.println(a2);
	//a2.add(300);
	al.addAll(1,a2);
	System.out.println(al);
	
	a2.clear();
	a2.add(20);
	a2.add(200);
	System.out.println(a2);
	al.clone();
	System.out.println(al);
	System.out.println(al.contains(200));
	System.out.println(al.contains(20));
	System.out.println(al.containsAll(a2));
	a2.ensureCapacity(2);
	a2.clear();
	System.out.println(a2);
	System.out.println(al.equals(a2));
	//al.forEach(null);
	System.out.println(al.get(2));
	System.out.println(al.getClass());
	System.out.println(al.hashCode());
	System.out.println(al.indexOf("kirupa"));
	System.out.println(al.isEmpty());
	System.out.println(al.iterator());
	System.out.println(al.lastIndexOf("kirupa"));
	System.out.println(al.listIterator());
	System.out.println(al.listIterator(1));
	al.notify();
	al.notifyAll();
	al.parallelStream();
	al.remove(0);
	System.out.println(al);
	System.out.println(al);*/
	/*LinkedList l=new LinkedList();
	l.add(100);
	l.add(50);
	l.add(150);
	l.add(25);
	l.add(75);
	System.out.println(l);
	l.add(3,600);
	System.out.println(l);
	LinkedList l2=new LinkedList();
	l2.addAll(l);
	System.out.println(l2);
	l.addFirst(1);
	l.addLast(9);
	System.out.println(l);
	System.out.println(l.element());*/
	/*ArrayDeque ad=new ArrayDeque();
	ad.add(10);
	ad.add(20);
	ad.add(30);
	ad.add(40);
	ad.add(50);
	System.out.println(ad);
	System.out.println(ad.getFirst());
	System.out.println(ad.getLast());
	ad.offer(22);
	System.out.println(ad.offerFirst(11));
	System.out.println(ad.peek());
	System.out.println(ad.peekFirst());
	System.out.println(ad.poll());
	System.out.println(ad);*/
	//PriorityQueue p=new PriorityQueue();
	/*TreeSet p=new TreeSet();
	p.add(25);
	p.add(19);
	p.add(75);
	p.add(150);
	p.add(85);
	p.add(30);
	p.add(10);
	System.out.println(p);
	System.out.println(p.ceiling(55));
	System.out.println(p.floor(8));
	System.out.println(p.floor(55));*/
	//don't allow duplicates
	HashSet hs=new HashSet();
	hs.add(100);
	hs.add(50);
	hs.add(150);
	hs.add(25);
	hs.add(75);
	hs.add(125);
	hs.add(175);
	hs.add(400);
	hs.add(400);
	hs.add("shri");
	hs.add("kiru");
	System.out.println(hs);
	LinkedHashSet lhs=new LinkedHashSet();
	lhs.add(100);
	lhs.add(50);
	lhs.add(150);
	lhs.add(25);
	lhs.add(75);
	lhs.add(125);
	lhs.add(175);
	lhs.add(400);
	lhs.add(400);
	lhs.add("shri");
	lhs.add("kiru");oo
	System.out.println(lhs);
	}
}
