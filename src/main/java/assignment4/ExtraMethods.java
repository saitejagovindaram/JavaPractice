package assignment4;
import java.util.*;
public class ExtraMethods {
    public static void main(String[] args) {
        ArrayList<Integer> a1=new ArrayList<Integer>();
        ArrayList<Integer> a2 = new ArrayList<Integer>();
        a2.add(100);
        a2.add(50);
        System.out.println(a2);

        a1.add(4);
        a1.add(3);
        System.out.println(a1);
        a1.add(1,100);
        System.out.println(a1);
        a1.set(2,0);
        System.out.println(a1);
        a1.remove(0);
        System.out.println(a1);

        a1.retainAll(a2);
        System.out.println("after retainAll:"+a1);
        a1.addAll(a2);
        System.out.println("after addAll:"+a1);
        System.out.println("******************");
        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.add(5);
        ll.addFirst(2);
        ll.addLast(1);
        ll.removeLast();
        ll.removeFirst();
        System.out.println("Linked list:"+ll);
        LinkedList<Integer> ll1 = new LinkedList<Integer>();
        ll1.addLast(45);
        ll.addAll(ll1);
        System.out.println("after addAll"+ll);
        System.out.println("*****************");
        Set<Integer> s = new HashSet<Integer>();
        s.add(5);
        s.add(3);
        s.add(8);
        System.out.println("set:"+s);
        Set<Integer> s1 = new HashSet<Integer>();
        s1.add(1);
        s1.add(7);
        s1.add(3);
        System.out.println("set-1:"+s1);
        s.addAll(s1);
        System.out.println("after addAll:"+s);
        s.retainAll(s1);
        System.out.println("after retainAll:"+s);
    }
}
