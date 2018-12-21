import static org.junit.Assert.*;

import org.junit.Test;


public class WordCountTest {

	@Test
	public void WordCountTest() {
//		WordCount file=new WordCount("C:/Users/kansoni/Documents/");
		WordCount wordcount= new WordCount();
	assertEquals(100,wordcount.wordCount("C:/Users/kansoni/Documents/MySQL.txt"));
	}

}
