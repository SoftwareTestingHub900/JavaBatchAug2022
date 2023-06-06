package HandlingDemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {
	public static void main(String[] args) throws IOException {
		String filepath ="./src/HandlingDemo/DataReadFile";
		FileReader reader = new FileReader(filepath);
		BufferedReader br = new BufferedReader(reader);
		//System.out.println(br.readLine());
		String line = null;
		while (( line = br.readLine())  != null) {
			System.out.println(line);
			
		}
	}

}
