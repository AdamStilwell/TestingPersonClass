package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;
        String expectedMiddleName = "";
        String expectedLastName = "";
        Integer expectedHeightInInch = Integer.MAX_VALUE;
        Integer expectedNumberOfKisses = Integer.MAX_VALUE;
        Boolean expectedIsAlive = true;

        // When
        Person person = new Person(expectedName, expectedMiddleName, expectedLastName, expectedAge, expectedHeightInInch, expectedNumberOfKisses,  expectedIsAlive);

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithFullPersonClass() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";
        String expectedMiddleName = "S.";
        String expectedLastName = "Kennedy";
        Integer expectedNumberOfKisses = 2;
        Integer expectedHeightInInch = 71;
        Boolean expectedIsAlive = true;

        // When
        Person person = new Person(expectedName, expectedMiddleName, expectedLastName, expectedAge, expectedHeightInInch,expectedNumberOfKisses, expectedIsAlive);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();
        String actualMiddleName = person.getMiddleName();
        String actualLastName = person.getLastName();
        Integer actualHeightInInch = person.getHeightInInch();
        Integer actualNumberOfKissses = person.getNumberOfKisses();
        Boolean actualIsAlive = person.getIsAlive();


        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedMiddleName, actualMiddleName);
        Assert.assertEquals(expectedLastName, actualLastName);
        Assert.assertEquals(expectedHeightInInch, actualHeightInInch);
        Assert.assertEquals(expectedNumberOfKisses, actualNumberOfKissses);
        Assert.assertEquals(expectedIsAlive, actualIsAlive);



    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetMiddleName() {
        // Given
        Person person = new Person();
        String expected= "S.";

        // When
        person.setMiddleName(expected);

        // Then
        String actual = person.getMiddleName();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSetLastName() {
        // Given
        Person person = new Person();
        String expected = "Kennedy";

        // When
        person.setLastName(expected);

        // Then
        String actual = person.getLastName();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSetHeightInInch() {
        // Given
        Person person = new Person();
        Integer expected = 71;

        // When
        person.setHeightInInch(expected);

        // Then
        Integer actual = person.getHeightInInch();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSetNumberOfKisses() {
        // Given
        Person person = new Person();
        Integer expected = 2;

        // When
        person.setNumberOfKisses(expected);

        // Then
        Integer actual = person.getNumberOfKisses();
        Assert.assertEquals(expected, actual);
    }
    @Test
    public void testSetAliveOrNot() {
        // Given
        Person person = new Person();
        Boolean expected = true;

        // When
        person.setAliveOrNot(expected);

        // Then
        Boolean actual = person.getIsAlive();
        Assert.assertEquals(expected, actual);
    }
}
