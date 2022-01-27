package file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Fileread {
 public static void main(String args[]) throws IOException {
	 char[] data=new char[100];
	 try {
		FileReader input=new FileReader("file.txt");
		input.read(data);
		System.out.println("Data read successfully");
		System.out.println(data);
		
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	 
 }
}
