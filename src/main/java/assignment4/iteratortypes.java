package assignment4;
import java.util.*;
public class iteratortypes {
    public static void main(String args[]) {
        Map<Integer, String> students = new HashMap<>();
        students.put(1, "Anamika");
        students.put(2, "Bob");
        students.put(3, "Mary");

        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            System.out.println("Key : " + entry.getKey() + " value : " + entry.getValue());
        }

        for(Integer i: students.keySet()){
            System.out.println("key: "+i);
        }
        for(String s:students.values()){
            System.out.println("value: "+s);
        }

        students.forEach((k,v)-> System.out.println("Key="+k+",value="+v));

        System.out.println("*****************");
        List<String> l = new ArrayList<String>();
        l.add("A");
        l.add("B");
        l.add("C");
        l.add("D");
        for (int i = 0; i < l.size(); i++)
            System.out.println(l.get(i));
        System.out.println("------------------");
        for (String i : l)
            System.out.println(i);
        System.out.println("-----------------------");
        int i = 0;
        while (i < l.size()) {
            System.out.println(l.get(i));
            i++;
        }
        System.out.println("-----------------------");
        ListIterator<String> it1 = l.listIterator();
        while (it1.hasNext())
            System.out.println(it1.next());
        System.out.println("-----------------------");
        l.forEach(
                (temp) -> { System.out.println(temp); });

        System.out.println("***************");

        Set<Integer> set = new HashSet<Integer>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);
        Iterator value = set.iterator();
        while (value.hasNext()) {
            System.out.println(value.next());
        }

    }
}
