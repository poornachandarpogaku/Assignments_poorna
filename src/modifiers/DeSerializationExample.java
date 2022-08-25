package modifiers;
import java.io.*;

public class DeSerializationExample
{
   public static void main(String[] args) throws Exception
   {
      FileInputStream fis = new FileInputStream("info.txt");
      ObjectInputStream ois = new ObjectInputStream(fis);

      Object obj = ois.readObject();
      Employee emp = (Employee)obj;

      System.out.println(emp);
      System.out.println(emp.id + " -- " +emp.name + " -- " + emp.salary);
   
      ois.close();
   }
}