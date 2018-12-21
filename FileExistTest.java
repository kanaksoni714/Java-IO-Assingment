import static org.junit.Assert.*;

import org.junit.Test;


public class FileExistTest {

	@Test
	public void testtoCheckFile() {
		FileExist fileCheck=new FileExist("C:/Users/kansoni/Documents/MySQL.txt");
		boolean expected= fileCheck.isFileExists(fileCheck);
		boolean actual=true;
		assertTrue(expected==actual);
	}

}
