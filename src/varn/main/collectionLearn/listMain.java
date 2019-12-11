package varn.main.collectionLearn;

import varn.main.genericParadigm.Persion;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class listMain {
    public static void main(String[] args) {
        listIterator();
    }

    static void listIterator() {
//         jdk 8 报错
        ArrayList<String> list = new ArrayList<String>();
        list.add("ssss2");
        list.add("ssss");
        list.add("ssssssss");
        for (String it : list) {
            System.out.println(it);
        }

        int s = list.indexOf("ssss");
        System.out.println("sss:::::"+s);
        LinkedList<Number> list2 = new LinkedList<Number>();
        list2.add(1);
        list2.add(2);
        list2.add(25);
        list2.listIterator();
        for (Number a : list2) {
            System.out.println(a);
        }
        for (Iterator<Number> it = list2.iterator(); it.hasNext(); ) {
            Number n = it.next();
            System.out.println(n);
        }


        ArrayList<Persion> ps = new ArrayList<>();
        Persion p = new Persion("a",23);
        Persion p1 = new Persion("ab",23);
        Persion p2 = new Persion("ab",23);
        ps.add(p);
        ps.add(p1);
        ps.add(p2);
        Persion p3 = new Persion("a",23);
        boolean flag = ps.contains(p3);
        System.out.println(flag);

    }
}
