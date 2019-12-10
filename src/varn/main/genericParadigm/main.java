package varn.main.genericParadigm;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("world");
        String first = list.get(0);
        System.out.println(first.toString());

        List<Number> l = new ArrayList<Number>();
//        事实上如果可以 编译器可以自动推断泛型类型，就可以省略后面的泛型类型
        List<Number> l2 = new ArrayList<>();

        l.add(1);
        l.add(2.33);
        Number lf = l.get(1);
        System.out.println(lf);


    }
}
