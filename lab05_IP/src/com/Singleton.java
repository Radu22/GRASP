package com;

public class Singleton {
    private Singleton(){}
    private int atribut=0;
    public static Singleton instance=null;
    public static Singleton getSingleInstance()
    {
        if(instance==null)
        {
            instance=new Singleton();

        }
        return instance;
    }

    public int getAtribut() {
        return atribut;
    }

    public void setAtribut(int atribut) {
        this.atribut = atribut;
    }
}
