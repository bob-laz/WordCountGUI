package application;

import java.io.File;
import java.io.FileNotFoundException;

public class FileProcessingTest {
	
	public static void main(String[] args) throws FileNotFoundException{
		FileProcessing test = new FileProcessing(new File("C:\\Users\\Bob\\OneDrive\\Documents\\Augsburg\\Compilers I\\LaskowskiProjectOne\\src\\myPackage\\input.txt"));
		
		System.out.println(test.countWords());
		System.out.println(test.countDiffWords());
		test.countByWord();
	}
	
}