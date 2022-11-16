package com.example.javaoop;

import android.util.Log;

public class Lion extends Cat{
    public Lion(int i, String murza) {
    }

    public Lion() {

    }

    public void talk() {
        Log.i("talk()", "R-r-r! I'm lion. My name is " + name + ",and i'm " + age + " years old" + Cat.whatCatsLike());
    }

}
