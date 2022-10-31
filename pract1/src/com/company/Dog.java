package com.company;
import java.lang.*;
public class Dog {

    private String name;
    private int age;

    public Dog(String n, int a){
        this.name = "Dima";
        this.age = 32;
    }
    public Dog(String n){
        this.name = "Rudy";
        this.age = 42;
    }
    public Dog(){
        this.name = "Dawg";
        this.age = 42;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName(String name){
        return name;
    }
    public int getAge() {
        return age;
    }

    @Override
    public String toString(){
        return this.name+", age "+this.age;
    }

    public void intoHumanAge(){
        System.out.println(name+"'s age in human years is "+age*7+" years");
    }
}