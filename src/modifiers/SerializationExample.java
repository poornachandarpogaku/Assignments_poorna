package modifiers;

import java.io.*;

 class Employee implements Serializable
{
	transient int id = 112;
   String name = "john";
   double salary = 1000.0;

   public Employee() {
      System.out.println("Employee class constructor is called...");
   }
}

public class SerializationExample
{
   public static void main(String[] args) throws Exception
   {
      FileOutputStream fos = new FileOutputStream("info.txt");
      ObjectOutputStream oos = new ObjectOutputStream(fos);

      Employee emp = new Employee();
      System.out.println(emp);
      System.out.println(emp.id + " - " + emp.name + " - " + emp.salary);
      oos.writeObject(emp);

      oos.flush();
      oos.close();
   }
}
