package com.example.javaoop;

import android.util.Log;

public class Puma extends Cat{
    public void someMethod() {
        this.age = 3;
        this.name = "Puma";
    }
    public void talk(){
        Log.i("talk()", "R-r-r! I'm puma. My name is" + name + ",and i'm" + age + " years old");
    }
}




