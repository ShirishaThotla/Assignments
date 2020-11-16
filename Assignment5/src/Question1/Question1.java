package Question1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;


public class Question1 {

	public void handleException(String path) {
	
		File file = null;
		try {
			file = new File(path);
				if(file.exists()) {
					
					FileWriter fileWriter = new FileWriter(file.getAbsoluteFile());
					BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
					bufferedWriter.write("Welcome to Java");
					bufferedWriter.close();
					fileWriter.close();
				}
				else {
					throw new Exception("File not found");
				}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			file = null;
		}
		
	}
		       
}

