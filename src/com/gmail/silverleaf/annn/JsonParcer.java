package com.gmail.silverleaf.annn;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintWriter;

public class JsonParcer {
    private File file;

    public JsonParcer(String fileName) {
        this.file = new File(fileName);
    }

    public JsonParcer() {
        super();
    }

    public Person loadPerson() throws FileNotFoundException {
        Gson gson = new Gson();
        Person person = null;

        try {
            person = gson.fromJson(new FileReader(file), Person.class);
        } catch (FileNotFoundException e) {
            throw e;
        }
        return person;
    }

    public void savePerson(Person person) throws FileNotFoundException {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String personString = gson.toJson(person);

        try (PrintWriter pw = new PrintWriter(file)) {
            pw.println(personString);
        } catch (FileNotFoundException e) {
            throw e;
        }
    }
}
