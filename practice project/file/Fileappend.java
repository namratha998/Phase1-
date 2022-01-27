package file;

import java.io.FileWriter;
import java.io.IOException;

public class Fileappend {
  public static void main(String args[]) {
	  String data="female,18yrs";
	  try {
		FileWriter output=new FileWriter("file.txt",true);
		output.write(data);
		System.out.println("data appended succesfully");
		output.close();
	} catch (IOException e) {
		
		e.printStackTrace();
	}
  }
}
