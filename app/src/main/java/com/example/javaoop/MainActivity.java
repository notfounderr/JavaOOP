package com.example.javaoop;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.*;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements Printable {

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
//        z = z++;
//
//        Button button = findViewById(R.id.button);
//
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });
//        Cat singingCat = new Cat(){
//            @Override
//          public void talk() {
//              Log.i("talk()", "Im singing! Around the world...");
//          }
//        };
//        singingCat.talk();
//
//        Cat sam = new Cat();
//        sam.talk();
//
//        myCat = new Cat(4, "Puma");
//        myCat.talk(3);
//        Cat vaska = new Cat();
//        Cat murzik = new Lion(2, "Murza");
//        Cat glasha = new Cat();
//
//        glasha.age = 1;
//        glasha.name = "Masha";
//
//        Log.i("numberOfLegs", String.valueOf(Cat.numberOfLegs));
//        glasha.talk();
//
//        Puma puma = new Puma();
//        puma.age = 3;
//        puma.name = "Puma";
//
//        Puma bagira = new Puma();
//        bagira.age = 3;
//        bagira.name = "Puma";
//
//        puma.breathe();
//        puma.talk();
//        puma.isAlive = true;
//        Log.i("isAlive", String.valueOf(puma.isAlive));
//        Log.i("breathe", "My name is " + puma.name + " and " + puma.breathe());
//
//        Lion lion = new Lion();
//        lion.age = 5;
//        lion.name = "tigr";
//        lion.talk();
//
//        ArrayList<Cat> cats = new ArrayList<>();
//        cats.add(vaska);
//        cats.add(bagira);
//        cats.add(puma);
//        cats.add(murzik);
//        cats.add(lion);
//
//        Cat cat = cats.get(0);
//        Cat cat1 = cats.get(1);
//        Cat cat2 = cats.get(2);
//        Cat cat3 = cats.get(3);
//        Cat cat4 = cats.get(4);
//
//        Puma puma1 = (Puma)cats.get(1);
//        puma1.talk();
//
//        Cat cat5 = cats.get(4);
//        if(cat5 instanceof Puma) {
//            Puma puma2 = (Puma)cat5;
//            puma2.talk();
//        }else{
//            Log.i("instanceof", "This is not Puma" );
//        }
//        Cat cat6 = new Cat();
//        Log.i("numberOfLegs", " cat6 number Of Legs " + Cat.numberOfLegs + Cat.whatCatsLike());
//
//        Cat cat32 = new Cat(1, "Ceasar");
//        cat32.talk();
//        Cat cat33 = new Cat(5, "Petr");
//        cat33.talk();
//        Cat cat34 = new Cat(8, "Boris");
//        cat34.talk();
//
//        Cat cat35 = new Cat();
//        Cat cat36 = new Cat();
//        Cat cat37 = new Cat();
//        Cat cat38 = new Cat();
//
//        Log.i("count ", "" + Cat.count);
//
//        Cat.CountResetter countResetter = new Cat.CountResetter();
//
//        Log.i("count ", "" + Cat.count);
//
//        cat35.catchMouse(1);
//        cat36.catchMouse(3);

        Cat john = new Puma();
        Cat tim = new Lion(4,"Tim");
        tim.age = 3;
        tim.name = "Tim";

        tim.talk();



        printAnyObject(new Lion());
        printAnyObject(new MainActivity());

        Printable printable = new Puma();
        printable.print();
        ((Puma)printable).move();
        Movable.someMethod();

        Puma puma = new Puma();
        Log.i("speedOfMoving", "" + puma.speedOfMoving);

        Log.i("speedOfMoving", "" + ((Puma)printable).speedOfMoving);

        Log.i("speedOfMoving", "" + Movable.speedOfMoving);
        }
        void printAnyObject(Printable printable) {
    }


    @Override
    public void print() {

    }

}