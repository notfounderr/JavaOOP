package com.example.javaoop;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.*;

public class MainActivity extends AppCompatActivity {

    //private
    //package access
    //protected
    //public

    Cat myCat;
    int z;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        z = z++;

        myCat = new Cat(4, "Puma");
        myCat.talk();


        Cat murzik = new Cat(2, "Murza");
        murzik.talk();
        murzik.breathe();


        Cat glasha = new Cat();
        glasha.age = 1;
        glasha.name = "Masha";
        glasha.numberOfLegs = 4;
        Log.i("numberOfLegs", String.valueOf(glasha.numberOfLegs));
        glasha.talk();

        Puma puma = new Puma();
        puma.name = "Leo";

        puma.breathe();
        puma.talk();
        puma.isAlive = true;
        Log.i("isAlive", String.valueOf(puma.isAlive));
        Log.i("breathe", "My name is " + puma.name + " and " + puma.breathe());
    }

    void method(double x, int y) {
        int a;
        a = 1;
        a = y + 1;
        double d = x*2;
        z = a + y;
    }


    void method1() {
        int a;
        a = 1;
    }


}
