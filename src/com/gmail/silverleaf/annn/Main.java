package com.gmail.silverleaf.annn;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) {
        String fileName = "1.txt";
        JsonParcer jp = new JsonParcer(fileName);
        Person person = null;
        try {
            person = jp.loadPerson();
            System.out.println(person);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        person.setName("Andrey");

        try {
            jp.savePerson(person);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
