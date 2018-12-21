import java.util.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;


import java.io.IOException;
import java.nio.Buffer;

public class LineCount{

	
	public int countLines(String path) throws IOException {
		FileReader fr= new FileReader(path);
		BufferedReader br= new BufferedReader(fr);
		
		int count = 0;
			while (br.readLine() != null) {
				count++;

			}
		

	return count;
	}
}





