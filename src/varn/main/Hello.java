package varn.main;

import varn.main.javaArray.JavaArray;
import varn.main.javaObject.JavaObject;

/**
 * 程序的入口类
 */
public class Hello {
    public static void main(String[] args) {
        Hello.sayHello();
//        Pair<String, String> a = new Pair<String, String>("a", "b");
//        System.out.println(a.getFirst());
//        System.out.println(a.getSecond());
//        Pair<Number, String> b = new Pair<Number, String>(1, "abs");
//        System.out.println(b.getFirst());
//        System.out.println(b.getSecond());
//        int[] arr = new int[]{1, 4, 6, 7, 9, 100};
//        System.out.println(Hello.getMiddle(arr));

//        JavaArray.arrayTest();

        JavaObject a = new JavaObject();
        a.setId();
        System.out.println(JavaObject.nexId);
    }

    public static <T> T getMiddle(T... a) {
        return a[a.length / 2];
    }

    public static void sayHello() {
        System.out.println("hello world2");
    }
}
