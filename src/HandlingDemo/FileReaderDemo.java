package HandlingDemo;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderDemo {
	
	public static void main(String[] args) throws IOException  {
        String FilePath = "./src/HandlingDemo/DataReadFile";		
//		FileReader reader;
//		try {
//			reader = new FileReader(FilePath);
//			System.out.println(reader.read());
//	}
//		catch (FileNotFoundException e) {
//			System.out.println("Parent Exception");
//		}		
//		catch (IOException e) {
//			// TODO: handle exception
//		}
//		catch (Exception e) {
//			// TODO: handle exception
//		}
        FileReader reader = new FileReader(FilePath);
        //System.out.println((char)reader.read());
        int i;
        while ((i = reader.read()) != -1) {
        	System.out.print((char)i);
		}
        reader.close();
        
        FileWriter write = new FileWriter(FilePath);
        write.write("Java");
        write.append("Usman");
        write.close();
        	
			
		}
    
        
		}
	
	
		
	




