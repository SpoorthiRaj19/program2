package org.example;

public class Main {
    public int add(int a,int b)
    {
        return a+b;
    }
    public static void main(String[] args) {
        Main main=new Main();
        int res=main.add(2,3);
        System.out.println("res is "+res);
    }
}