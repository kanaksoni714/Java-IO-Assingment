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

public class EmployeeTest {

	@Test
	public void test() {

		String path = "C://Users//kansoni//Desktop//kanak.txt";
		Employee employee = new Employee(21, "Kanak", 5000);

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

		String path="C://Users//kansoni//Desktop//kanak.txt";


		InputStream input;
		try {
			input = new FileInputStream(path);

			
			try(ObjectInputStream objectInputStream =
			    new ObjectInputStream(input)){

				Employee personRead = (Employee) objectInputStream.readObject();
				
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
