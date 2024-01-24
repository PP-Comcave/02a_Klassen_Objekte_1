package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        Cat cat = new Cat();

        cat.name = "Alonzo";
        cat.furColor = "grey";
        cat.age = 35;
        //last



        System.out.println(cat.name);
        System.out.println(cat.age);
        System.out.println(cat.furColor);

        cat.sayHello();
        cat.tellYourAddress();
        Cat cat2 = new Cat();

        cat2.name = "Grizabella";
        cat2.furColor = "white";
        cat2.age = 29;


        output("-----");
        output(String.valueOf(cat2.tellyourAge()));
        output("-----");

        output(cat2.tellyourName());
        output(cat2.tellYourFurColor());

        cat2.sayHello();
        cat2.tellYourAddress();
       System.out.println(cat2.tellyourName());

    /*
          cat2.tellYourAddress();
        cat2.tellyourName();
      */
    }
    //test

   public static void output(String output_String){
        System.out.println(output_String);
   }

}

