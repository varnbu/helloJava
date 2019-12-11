package varn.main.genericParadigm;

public class PairTestMain {
    public static void main(String[] args) {
        Pair<Integer> p = new Pair<>(123, 456);
        int n = add(p);
        System.out.println(n);

        Pair<Number> p2 = new Pair<>(1.4, 5);
        set(p2, 1, 4);
        System.out.println(p2.getFirst());

//        PECS 准则 Producer Extends   Consumer Super
//        如果需要返回T 它是生产者 需要使用extends 通配符
//        如果需要写入T 它是消费者 需要使用super 通配符
//     Java还允许使用无限定通配符 <?> 不允许调用set(T) 传入引用 不允许调用get() 获取T引用 只能做一些null判断
//        isNUll()

    }

    static int add(Pair<? extends Number> p) {
        Number first = p.getFirst();
        Number last = p.getLast();
        return first.intValue() + last.intValue();
    }

    static void set(Pair<? super Integer> p, Integer first, Integer last) {
        p.setFirst(first);
        p.setLast(last);
    }

    static boolean isNUll(Pair<?> p) {
        return p.getFirst() == null || p.getLast() == null;
    }


}
