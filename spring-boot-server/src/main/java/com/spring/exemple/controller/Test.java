package com.spring.exemple.controller;

public class Test {

    public static void main(String[] args) {
        String text="hello word";
        printText(text);

       System.out.println(sum(2,5));

    }

    public static int sum(int a,int b){
        int s = a+b;
        return s;
    }
    public static void printText(String text){
        System.out.println(text);
        String messText="run witn debug";
        System.out.println(messText);
    }
    }
