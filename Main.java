package com.company.task2;

import com.company.task2.Human;

public class Main {

    public static void main(String[] args) {
       Human hum=new Human("Serezha",9,1.75,65.8);
       hum.say();
       Human girl1 = new Girl("Nastya",18,180,60);
       girl1.say();
       Human boy1 = new Boy("Andrew",15,175,55);
       boy1.say();
        }
}

