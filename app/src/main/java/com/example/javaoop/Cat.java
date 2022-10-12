package com.example.javaoop;

import android.util.Log;

public class Cat {
    int age;
    String name;

    public Cat()  {

    }

    public Cat(int age, String name)  {
        this.age = age;
        this.name = name;

    }


    public void talk(){
        Log.i("talk()", "Meow! Hi! My name is " + name +
    ", and i`m " + age + " years old.");
    }
}
