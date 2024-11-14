package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly rwOnly = new RWOnly();

        // Try Setting a value to name by directly accessing it using obj and else try printin it

        //rwOnly.name = "Rohit";
        //'name' has private access in 'com.driver.RWOnly'

        rwOnly.setName("Rohit");
        System.out.println(rwOnly.getName());
    }
}