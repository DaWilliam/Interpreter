import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Interpreter
{

	public static void main(String[] args)
	{
		/*
		ArrayList ar = new ArrayList<Integer>();
		ar.add(1);
		ar.add(2);
		System.out.println(ar.get(0) + " " + ar.get(1));
		int val = (int)ar.remove(0);
		System.out.print(val);
		*/
		
		try
		{
			Parser p = new Parser ("test4.txt");
			Program prog = p.parse();
			prog.execute();
		}
		catch (ParserException e)
		{
			System.out.println (e.getMessage());
		}
		catch (LexicalException e)
		{
			System.out.println (e.getMessage());
		}
		catch (IllegalArgumentException e)
		{
			System.out.println (e.getMessage());
		}
		catch (FileNotFoundException e)
		{
			System.out.println ("source file is not found");
		}
		catch (Exception e)
		{
			System.out.println ("unknown error occurred - terminating");
		}
		
	}

}
