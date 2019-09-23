package varn.main;

import java.util.Scanner;

public class JavaArray {
    public  static void arrayTest(){
        Scanner in = new Scanner(System.in);
        System.out.println("数组的基本示例");
        System.out.println("number k:");
        int k = in.nextInt();
        System.out.println("number n");
        int n = in.nextInt();

        int[] numbers = new int[n];

        for (int i=0;i<numbers.length;i++){
            numbers[i]=i+1;
        }

        int[] result = new int[k];

        for (int r: numbers) {
            System.out.println(r);
        }

    }
}
