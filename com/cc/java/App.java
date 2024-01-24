package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        Cat cat = new Cat();
       /*
         Cat cat2 = new Cat();
        cat2.name = "Jasper";
        */
        cat.name = "Alonzo";
        cat.furColor = "grey";
        cat.age = 35;



        System.out.println(cat.name);
        System.out.println(cat.age);
        System.out.println(cat.furColor);

        cat.SayHello();
        cat.tellYourAddress();
    /*
          cat2.tellYourAddress();
        cat2.tellyourName();
      */
    }
    //test

   

}

