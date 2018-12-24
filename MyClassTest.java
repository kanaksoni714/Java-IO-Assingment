import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.Test;


public class MyClassTest {

	@Test
	public void test() {

		String path = "C://Users//kansoni//Desktop//Count.txt";
		MyClass employee = new MyClass("Kanak", "Kanak", "Kanak","Kanak","Kanak");

		File f = new File(path);
		ObjectOutputStream oos;
		try {
			oos = new ObjectOutputStream(new FileOutputStream(f));
			oos.writeObject(employee);
			oos.flush();
			oos.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	@Test
	public void test1() {

		String path="C://Users//kansoni//Desktop//Count.txt";


		InputStream input;
		try {
			input = new FileInputStream(path);

			
			try(ObjectInputStream objectInputStream =
			    new ObjectInputStream(input)){

				MyClass personRead = (MyClass) objectInputStream.readObject();
				
				System.out.println(personRead);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


	}



}
