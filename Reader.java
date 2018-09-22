import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Reader {
	//String fileName;
	ArrayList<String> lines;
	ArrayList<String> firstWords;	
	String[] tokens;
	
	public Reader(String fileName) throws FileNotFoundException
	{		
		lines = new ArrayList<String>();
		firstWords = new ArrayList<String>();		
		Scanner code = new Scanner(new File(fileName));
	
		while(code.hasNextLine())
		{		
			lines.add(code.nextLine());	
		}
		
		code.close();
		tokens = new String[lines.size()];
		tokens = (String[])lines.toArray();
				
		/*
		for(int i = 0; i < lines.size(); i++)
		{
			if(lines.get(i).indexOf(" ") == -1)
				firstWords.add(lines.get(i));
			else
				firstWords.add(lines.get(i).substring(0, lines.get(i).indexOf(" ")));
		}
		*/
		for(int i = 0; i < tokens.length; i++)
		{
			
		}
		for(int i = 0; i < lines.size(); i++)
		{
			//System.out.println(firstWords.get(i));			
			System.out.println(lines.get(i));
		}
		
	}
	
	public String getLine(int indexIn)
	{
		return lines.get(indexIn);
	}
	
	public String getFirstWord(int indexIn)
	{
		return firstWords.get(indexIn);
	}
}
