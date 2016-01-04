package test;

import uppgift1.Skrivare2;
import uppgift1.StoryCalculator;

public class Test_uppgift1
{

	public Test_uppgift1()
	{
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		final Skrivare2 skrivare = new Skrivare2();
		// String text = skrivare
		// .ask("Please write a story containing atleast these 4 words\n"
		// + "Red, Ball, girl, birthday");

		final String text = "There was a girl. with a red ball!! do you like cake?";
		final StoryCalculator storyCalc = new StoryCalculator(text);
		try
		{

			Skrivare2.skrivUt("Number of lines = "
					+ storyCalc.getNumberOfLines());
		}
		catch (final Exception e)
		{
			e.printStackTrace();
			Skrivare2.skrivUtFel("FEL " + e.getMessage());
		}
	}
}
