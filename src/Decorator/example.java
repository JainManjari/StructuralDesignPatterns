package Decorator;

import java.util.*;
import java.io.*;

public class example {
	
	public static void main(String args[]) throws IOException
	{
		File file=new File("output.txt");
		file.createNewFile();
		
		OutputStream os=new FileOutputStream(file);
		
		DataOutputStream dos=new DataOutputStream(os);
		dos.writeChars("text");
		
		dos.close();
		os.close();
	}

}
