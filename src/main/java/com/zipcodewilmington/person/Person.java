package com.zipcodewilmington.person;

/**
 * Created by leon on 2/12/18.
 */
public class Person {
    private String name, middleName, lastName;
    private int age, heightInInch, numberOfKisses;

    private boolean isAlive;



    public Person() {
        name = "";
        middleName = "";
        lastName = "";
        age = Integer.MAX_VALUE;
        isAlive = true;
        numberOfKisses = Integer.MAX_VALUE;
    }

    public Person(int age) {
        setAge(age);
    }

    public Person(String name) {
        setName(name);
    }

    public Person(String name, String middleName, String lastName, int age, int heightInInch, int numberOfKisses, boolean isAlive) {
        setName(name);
        setMiddleName(middleName);
        setLastName(lastName);
        setAge(age);
        setHeightInInch(heightInInch);
        setNumberOfKisses(numberOfKisses);
        setAliveOrNot(isAlive);
    }

    public boolean setAliveOrNot(boolean isAlive) {
        return this.isAlive = isAlive;
    }

    public int setNumberOfKisses(int numberOfKisses) {
        return this.numberOfKisses = numberOfKisses;
    }

    public int setHeightInInch(int heightInInch) {
        return this.heightInInch= heightInInch;
    }

    public String setName(String name) {
        return this.name =name;
    }
    public String setMiddleName(String middleName) {
        return this.middleName = middleName;
    }
    public String setLastName(String lastName) {
        return this.lastName = lastName;
    }
    public int setAge(int age) {
        return this.age = age;
    }
    public String getName() {
        return new String(name);
    }

    public String getMiddleName(){
        return new String(middleName);
    }

    public String getLastName(){
        return new String(lastName);
    }

    public Integer getAge() {
        return new Integer(age);
    }
    public Integer getHeightInInch(){
        return new Integer(heightInInch);
    }

    public Integer getNumberOfKisses(){
        return new Integer(numberOfKisses);
    }
    public Boolean getIsAlive(){
        return new Boolean(isAlive);
    }
}

