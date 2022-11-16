package com.example.javaoop;

import android.util.Log;

public class Cat extends Animal{
    int age;
    String name;
    final static int numberOfLegs= 4;

    private String color;
    private String breed;
    public Cat()  {



    }
    public Cat(String color, String breed) {
        this.color = color;
        this.breed = breed;
    }
    public Cat(int age, String name)  {
        this.age = age;
        this.name = name;
    }


    public void talk(){
        Log.i("talk()", "Meow! Hi! My name is " + name +
                ", and i`m " + age + " years old.");
    }
    public void talk(int age){
        Log.i("talk()", "Meow! i`m " + age + " years old.");
    }

    public void talk(String hello){ Log.i("talk()", "Meow! " + hello);
    }
    public static String whatCatsLike(){
        return "i like playing, jumping and sometimes scratching";
    }

}
