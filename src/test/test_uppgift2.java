package test;

import java.io.FileNotFoundException;

import uppgift1.Skrivare2;
import uppgift2.WordFinder;

public class test_uppgift2
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		WordFinder finder;
		final Skrivare2 skrivare = new Skrivare2();
		try
		{
			// TODO Warning may need to change filepath
			finder = new WordFinder("src/uppgift2/wordlist.txt");
			Skrivare2.skrivUt(finder.findWord(skrivare
					.ask("Wich word are you looking for? ")));
		}
		catch (final FileNotFoundException e)
		{
			e.printStackTrace();
			Skrivare2.skrivUtFel("Error occured " + e.getMessage());
		}
	}
}
