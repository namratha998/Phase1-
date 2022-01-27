package file;

import java.io.FileWriter;
import java.io.IOException;

public class filewrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           String data="1,Amaira,Banglore,9876543210";
           try {
			FileWriter output=new FileWriter("file.txt");
			output.write(data);
			System.out.println("Data written Succesfully");
			output.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         
           
           
	}

}
