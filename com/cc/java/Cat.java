package com.cc.java;

public class Cat {
    String furColor;
    String name;
    int age;
    Cat (){
        System.out.println("we build a cat");
        furColor = "black";
    }
    public void sayHello () {
        System.out.println("Miau "+"my color is " +this.furColor);
    }
    public String tellyourName (){
      return name;
    }
    public String tellYourFurColor(){
        return this.furColor;
    }
    public int tellyourAge (){
        return this.age;
    }

    public void tellYourAddress(){
        System.out.println(this);
    }
}
