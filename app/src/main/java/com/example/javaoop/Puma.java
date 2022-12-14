package com.example.javaoop;

import android.util.Log;

public class Puma extends Cat implements Movable, Printable{
    private String pumaHelloText;

    @Override
    public void draw(){
        Log.i("draw()", "Draw Puma");
    }
    @Override
    public void move() {
        Log.i("move()", "Move Puma");
    }

    @Override
    public void print() {
        Log.i("print()", "Print Puma");
    }
}




