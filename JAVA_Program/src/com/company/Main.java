package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        //String类
        //substring方法
        String greeting = "Hello";
        String s = greeting.substring(0, 3);

        System.out.println(s);

        //用"+"连接两个字符串
        String expletive = "Expletive";
        String PG13 = "delete";
        String message = expletive + PG13;

        System.out.println(message);

        //用"+"连接一个字符串和一个int型的数据
        int age = 13;
        String rating = "PG" + age;

        System.out.println(rating);

        //join方法
        String all = String.join(",", "S", "M", "L", "XL");
        System.out.println(all);

        //通过重新赋值来改变字符串
        String origin = "Hello";
        origin = origin.substring(0, 3) + "p!";

        System.out.println(origin);

        //通过equals方法来判断两个字符串是否相等
        String A = "HaHaHa";
        String B = "HaHaHa";
        String C = "HaHa";

        System.out.println(A.equals(B));
        System.out.println(A.equals(C));
        System.out.println("HaHaHa".equals(A));

    }
}
