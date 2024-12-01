package com.practice.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @author Sourav Suman - 01-12-2024
 */
public class SerializationTest {

    public static void main(String[] args) {

        Singleton singleton = Singleton.INSTANCE;

        // SERIALIZE OBJECT
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("singleton.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(singleton);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        //DESERIALIZE OBJECT
        try {
            FileInputStream fileInputStream = new FileInputStream("singleton.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            Singleton deserializeSingleton = (Singleton) objectInputStream.readObject();
            System.out.println(deserializeSingleton.hashCode());
            System.out.println(singleton.hashCode());
            System.out.println("Are both instance same?  " + (singleton.hashCode() == deserializeSingleton.hashCode()));
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }


    }
}
