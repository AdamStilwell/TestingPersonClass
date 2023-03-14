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

    public void setAliveOrNot(boolean isAlive) { this.isAlive = isAlive;}

    public void setNumberOfKisses(int numberOfKisses) {
        this.numberOfKisses = numberOfKisses;
    }

    public void setHeightInInch(int heightInInch) {
        this.heightInInch= heightInInch;
    }

    public void setName(String name) {
        this.name =name;
    }
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public String getMiddleName(){
        return middleName;
    }

    public String getLastName(){
        return lastName;
    }

    public Integer getAge() {
        return age;
    }
    public Integer getHeightInInch(){
        return heightInInch;
    }

    public Integer getNumberOfKisses(){
        return numberOfKisses;
    }
    public Boolean getIsAlive(){
        return isAlive;
    }
}

