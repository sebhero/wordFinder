package uppgift1;

import java.util.Scanner;

public class StoryCalculator extends TextCalculator
{

	public StoryCalculator()
	{
	}

	/**
	 * Sets the story.
	 * 
	 * @param text
	 */
	public StoryCalculator(String text)
	{
		super(text);
	}

	/**
	 * Calculates how many lines the story has. Determined by ! ? and .
	 */
	@Override
	public int doCalculation() throws Exception
	{
		int lineCount = 0;
		try
		{

			final Scanner strScanner = new Scanner(this.getInputText());
			// hitta alla meningar som innehåller ! eller . eller ?
			strScanner.useDelimiter("\\!|\\.|\\?");

			while (strScanner.hasNext())
			{
				// Skrivare2.skrivUt("line = " + strScanner.next());
				strScanner.next();// iom det är en linkedlist måste anropa next.
				lineCount++;
			}
			strScanner.close();
		}
		catch (final Exception e)
		{
			lineCount = 0;
			throw e;
		}

		return lineCount;

	}
}
