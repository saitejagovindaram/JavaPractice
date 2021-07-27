package assignment4;
import java.util.Stack;
import java.util.Vector;
public class vector_stack {
    public static void main(String[] args) {
        int n=5;
        Vector<Integer> v = new Vector<Integer>();
        for (int i = 0; i < n; i++)
            v.add(i);
        System.out.println("vector:"+v);
        for (int i = 0; i < v.size(); i++)
            System.out.println(v.get(i) + " ");


        Stack<Integer> s = new Stack<Integer>();
        s.push(1);
        s.push(2);
        s.pop();
        s.push(3);
        System.out.println("stack:"+s);
    }
}
