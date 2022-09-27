package com.example.attribusetservlet.model;

/*
 *           Leave your comment below if you have
 --------------------------------------------------------
 *  Java Bean has 3 main rules - POJO
 *  1. Implements Serializable
 *  2. No arg Constructor
 *  3. private members with getters and setters
 */

//This is simple Java bean

import java.io.Serializable;

public class Person implements Serializable {
    private String firstName;
    private String lastName;
    private int age;
//əgər error mesajı alarıqsa o zaman burada set etdiyimiz dəyərlər ekrana çıxacaq
    public Person() {
        this.firstName="Bob";
        this.lastName="Fisher";
        this.age=30;
    }
    //yox əgər biz set edəriksə ozaman bizim set etdiyimiz dəıyərlər ekrana çıxacaq
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
