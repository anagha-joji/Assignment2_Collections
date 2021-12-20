package assignment2Q2;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingWordsFromFile {
	static void CountWords(String filename, Map< String, Integer> words) throws FileNotFoundException
	{
		//creating file
        try {
        	File fObj = new File("output.txt");
        	if (fObj.createNewFile()) {
        		System.out.println("File created: " + fObj.getName());
        		} 
        	else {
        		System.out.println("File already exists.");
        		}
        	} 
        catch (IOException e) {
        	System.out.println("An error occurred.");
        	e.printStackTrace();
        	}
        //writing into the file
        try {
        	FileWriter myWriter = new FileWriter("output.txt");
        	myWriter.write("Hello There!!! Let's Learn Java.");
        	myWriter.close();
        	System.out.println("Successfull!");
        	} 
        catch (IOException e) {
        	System.out.println("An error occurred.");
        	e.printStackTrace();
        	}
        Scanner file=new Scanner (new File(filename));
        while(file.hasNext()) {
        	String word=file.next();
        	Integer count=words.get(word);
        			if(count!=null)
        				count++;
        			else
        				count=1;
        			words.put(word,count);
        			}
        file.close();
        }
	public static void main(String[] args)
	{
		Map<String,Integer> words=new HashMap<String, Integer>();
		try {
			CountWords("output.txt",words);
			} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
			}
		System.out.println(words);
		}
	}



