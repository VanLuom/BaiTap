package advance.dev1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import advance.dev.models.Student;
import advance.dev.models.dao.Manager;
import advance.dev.models.Person;
import advance.dev.models.Teacher;

public class MainApp {
  public static void main(String[] args) throws IOException {
    Manager manager = new Manager();
    List < Integer > number = new ArrayList < > ();
    FileInputStream fis;
    try {
      fis = new FileInputStream("in.txt");
      BufferedReader br = new BufferedReader(new InputStreamReader(fis));
      String line;
      while ((line = br.readLine()) != null) {
        if (line.indexOf("#sv") >= 0) {
        	System.out.println("Sinh Vien");
          String line1 = br.readLine();//name
          String arr[] = line1.split(":");
          String name = arr[1].trim();
 
          String line2 = br.readLine();
          String arr2[] = line2.split(":");//old
          int old = Integer.parseInt(arr2[1].trim());
 
          String line3 = br.readLine();
          String arr3[] = line3.split(":");//mark
          double mark = Double.parseDouble(arr3[1].trim());
          manager.add(new Student(name, old, mark));
        }
        if (line.indexOf("#tc") >= 0) {
        	System.out.println("Giao Vien");
          String line4 = br.readLine();//Name
          String arr[] = line4.split(":");
          String name = arr[1].trim();

          String line5 = br.readLine();
          String arr2[] = line5.split(":");//old
          int old = Integer.parseInt(arr2[1].trim());
          
          String line6 = br.readLine();
          String arr3[] = line6.split(":");//salay
          double salary = Double.parseDouble(arr3[1].trim());

          manager.add(new Teacher(name, old, salary));
        }
      }

      manager.print();
      System.out.println("Diem cao nhat");
      manager.findExcellentStudents();
      System.out.println("luong cao nhat");
      manager.findExcellentTeacher();

    } catch (FileNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();

    }

  }
}
	
	
	
	

	
		





	
	


