
import java.util.*;



/**
 * ES234317 - Algorithms and Data Structures
 * Gasal | 2026-2027
 * Coursework   : 04
 * Student ID   : 5026251205
 * Full Name    : Muhammad Haekal Pashahudin
 * Class        : C
 */

public class test {

    public static void main(String[] args) {
    //    System.out.println("Hello world!");
    //    ArrayList<Integer> l = new ArrayList<>();

    //    l.add(5);
    //    l.add(10);
    //    l.add(5);
    //    l.add(15);
    //    System.out.println(l);

    //    l.add(1, 7);
    //    System.out.println(l);

    //    l.set(3, 25);
    //    System.out.println(l);

    //    l.remove(1);
    //    System.out.println(l);

    //    l.remove(new Integer(10));
    //     System.out.println(l);

    //     Integer[] a = {10,20,10,5};
    //     l.addAll(Arrays.asList(a));
    //     System.out.println(l);

        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q);

        q.remove();
        System.out.println(q);

        q.add(4);
        System.out.println(q);

        System.out.println("==============================");
        Stack<Integer> s = new Stack<>();
        s.push(5);
        s.push(6);
        s.push(7);

        System.out.println(s);

        s.pop();
        System.out.println(s);

        s.add(8);
        System.out.println(s);
        
        
    }
    
   
}
