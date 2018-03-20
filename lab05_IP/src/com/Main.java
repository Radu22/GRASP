package com;

public class Main {

    public static void main(String[] args) {

        Singleton s1=Singleton.getSingleInstance();
        s1.setAtribut(5);
        Singleton s2=Singleton.getSingleInstance();
        s2.setAtribut(4);
        System.out.println(s1.getAtribut());
        System.out.println(s2.getAtribut());

    }
}
