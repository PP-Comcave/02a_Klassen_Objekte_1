package com.cc.java;

public class Cat {
    String furColor;
    String name;
    int age;
    Cat (){
        System.out.println("we build a cat");
        furColor = "black";
    }
    public void SayHello () {
        System.out.println("Miau "+"my color is " +this.furColor);
    }
    public void tellyourName (){
        System.out.println(this.name);
    }
    public void tellYourAddress(){
        System.out.println(this);
    }
}
