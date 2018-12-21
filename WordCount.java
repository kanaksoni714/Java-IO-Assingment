//A Java WordCount Application:
//accept the path of a file from user and count the number of words in that file and print it on the console.

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class WordCount {
	public int wordCount(String path) {
		int count = 0;

		File file = new File(path);
		try (Scanner sc = new Scanner(new FileInputStream(file))) {

			while (sc.hasNext()) {
				sc.next();
				count++;
			}
			System.out.println("Number of words: " + count);
		}
		// System.out.println("Number of words in WordCount.txt: "+ wordCount);
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
		return count;

	}
}
