package com.kuliah.sample;

public class Overloading {
    public void tampil(){
        System.out.println("I Love Dart");
    }

    public void tampil(int i){
        System.out.println("Method dengan 1 parameter");
    }

    public void tampil(int i, int j){
        System.out.println("Method dengan 2 parameter");
    }

    public void tampil(String str){
        System.out.println(str);
    }
}
