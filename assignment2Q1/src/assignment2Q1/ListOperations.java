package assignment2Q1;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;

public class ListOperations {

	public static int[] main(String[] args) {
		//creating list of numbers with duplicate values
		ArrayList<Integer> numList = new ArrayList<Integer>(Arrays.asList(1,2,3,2,2,3,1,4,5,6,1,7,8,9,7));
		//creating string list with duplicate values
		ArrayList<String> strList = new ArrayList<String>(Arrays.asList("Anagha","Beneetha","Anagha","Sreya","Alka","Raj","Alka"));
		
		//printing lists with duplicates
		System.out.println("Integer ArrayList with duplicates: " +numList);
		System.out.println("String ArrayList with duplicates: " +strList);
		
		//removing duplicates using Hash Set
		LinkedHashSet<Integer> numSet = new LinkedHashSet<Integer>(numList);
		LinkedHashSet<String> strSet = new LinkedHashSet<String>(strList);
		
		//creating new lists without duplicates
		ArrayList <Integer> numListWithoutDuplicates = new ArrayList<Integer>(numSet);
		List<String> strListWithoutDuplicates = new ArrayList<String>(strSet);
		
		//printing the lists 
		System.out.println( "Integer ArrayList after removing duplicates: "+numListWithoutDuplicates);
		System.out.println("String ArrayList after removing duplicates"+strListWithoutDuplicates);
		
		//sorting string list
		Collections.sort(strListWithoutDuplicates); //method in collections that sort in ascending order
		
		//printing sorted String List
		System.out.println("Sorted String List is: " +strListWithoutDuplicates);
		
		//separating odd and even
		//ArrayList<Integer> separateOddEven = new ArrayList<Integer>();
		
		
		try {
			  
            // Create a FileWriter instance
            
        	FileWriter fw=new FileWriter("C:\\Users\\Achu\\eclipse-workspace\\assignment2Q1\\src\\testout.txt"); 
        	
   
            FileOutputStream writer;
			// Write the above string to this writer
            // This will put the string in the stream
            // till it is printed on the console
            writer.write(numListWithoutDuplicates);
            writer.write(strListWithoutDuplicates);
  
            // Now clear the stream
            // using flush() method
            writer.flush();
            writer.flush();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}


