package com.xworkz.SerializationandDeserialization;


import java.io.*;
import java.math.BigDecimal;

public class HelloSerializationFile {

  public static void main(String[] args) throws IOException, ClassNotFoundException {

      Person person = new Person("mkyong", 50, new BigDecimal(1000));

      File file = new File("person.anything");

      writeObjectToFile(person, file);

      Person p = readObjectFromFile(file);

      System.out.println(p);

  }

  // Serialization
  // Save object into a file.
  public static void writeObjectToFile(Person obj, File file) throws IOException {
      try (FileOutputStream fos = new FileOutputStream(file);
           ObjectOutputStream oos = new ObjectOutputStream(fos)) {
          oos.writeObject(obj);
          oos.flush();
      }
  }

  // Deserialization
  // Get object from a file.
  public static Person readObjectFromFile(File file) throws IOException, ClassNotFoundException {
      Person result = null;
      try (FileInputStream fis = new FileInputStream(file);
           ObjectInputStream ois = new ObjectInputStream(fis)) {
          result = (Person) ois.readObject();
      }
      return result;
  }

}