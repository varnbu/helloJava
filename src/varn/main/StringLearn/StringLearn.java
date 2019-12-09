package varn.main.StringLearn;

import com.sun.xml.internal.ws.util.StringUtils;

import java.util.Arrays;

public class StringLearn {
    public static void main(String[] args) {
        String s = "Hello";
        System.out.println(s);
        String s0 = s.toLowerCase();
        System.out.println(s0);

        // 比较两个字符串是否相等
        String s1 = "hello";
        String s2 = "hello";
        System.out.println(s0 == s2);
        System.out.println(s1 == s2);
//         比较字符串相等
        System.out.println(s2.equals(s0));
//        忽略大小写比较字符串
        System.out.println(s0.equalsIgnoreCase(s2));
//     包含子串
        System.out.println(s.contains("ll"));

        s.indexOf("ss");
        s.lastIndexOf("ss");
        s.startsWith("ss");
        s.endsWith("ss");

//         提取子串
        s.substring(3);
        s.substring(2, 4);

        s.trim();  // 去除首尾空白符
//        s.strip();  // jdk 11  作用同上 但是可以去除类似中文的空格字符串 \u3000

        s.isEmpty();
//        s.isBlank(); // 判断空白字符串  类似于这种 "   "
//        替换子串
        s.replace("ll", "RR");
        s.replace('h', 'W');

        String ss = "A,B;C, D";
        ss = ss.replaceAll("[\\,\\;\\s]+", ","); // A,B,C,D

//        分割字符串
        String[] sarr = ss.split(",");
        System.out.println(Arrays.toString(sarr));
//      拼接字符串
        System.out.println(String.join("-",sarr));

//      类型转换
        String.valueOf(123);
        System.out.println(String.valueOf(true));
//      转换为 char[]
        char[] cs = "hello".toCharArray();
        String sss = new String(cs);

    }
}
