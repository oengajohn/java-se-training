package com.systechafrica.part3.inputoutput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class WorkingWithFilesAndObjects {
    public static void main(String[] args) {

        String fileSeparator = System.getProperty("file.separator");
        File studentsFile = new File("java-se-training" + fileSeparator + "students.txt");
        Student emily = new Student("Emily", "003", "emily@gmail.com");

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(studentsFile))) {
            oos.writeObject(emily);
        } catch (IOException e) {

        }
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(studentsFile))){
            Student readStudent = (Student) ois.readObject();
            System.out.println(readStudent);
        } catch (IOException | ClassNotFoundException e) {

        }

    }
}
