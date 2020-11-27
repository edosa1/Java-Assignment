/*	Student Name: Edosa Osarenotor

 * 	Student Number: C17338803
 *	Search Engine 
 * 
 * */


package searchengine;


import java.util.*;
import java.io.*;


public class Files {
	
	
	/**kjsdblk
	 * 
	 */
	public static final long serialVersionUID = 1L;
	//the files
	public File myFile1 = new File("src/first.txt");
	public File myFile2 = new File("src/second.txt");
	public File myFile3 = new File("src/third.txt");
	public File myFile4 = new File("src/fourth.txt");
	
	
	
	public Scanner Scanner1, Scanner2, Scanner3 ,Scanner4;
	public String line1, line2, line3, line4;
    // Create an instance of File for data.txt file    

	public void filing() {
			//try and catch to check if the file is being read
		try
		{
			Scanner1 = new Scanner(myFile1);
			Scanner2 = new Scanner(myFile2);
			Scanner3 = new Scanner(myFile3);
			Scanner4 = new Scanner(myFile4);
			Scanner1.useDelimiter(",");
			Scanner2.useDelimiter(",");
			Scanner3.useDelimiter(",");
			Scanner4.useDelimiter(",");

		}
		catch(FileNotFoundException event)
		{
			System.out.println("Files not found");
		}
	
	}
		
		
		
	
		
	    

	public Files() {
		
		filing();
	
		
		}

}


	

	
				
	

