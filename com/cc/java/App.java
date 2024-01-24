package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        Cat cat = new Cat();

        cat.name = "Alonzo";
        cat.furColor = "grey";
        cat.age = 35;



        System.out.println(cat.name);
        System.out.println(cat.age);
        System.out.println(cat.furColor);

        cat.sayHello();
        cat.tellYourAddress();
        Cat cat2 = new Cat();

        cat2.name = "Grizabella";
        cat2.furColor = "white";
        cat2.age = 29;



        System.out.println(cat2.tellyourAge());
        System.out.println(cat2.tellyourName());
        System.out.println(cat2.tellYourFurColor());

        cat2.sayHello();
        cat2.tellYourAddress();
       System.out.println(cat2.tellyourName());

    /*
          cat2.tellYourAddress();
        cat2.tellyourName();
      */
    }
    //test

   

}

