package uppgift2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * @author seb
 *
 */
/**
 * @author seb
 * 
 */
public class WordFinder
{

	private String	filePath;
	private Scanner	listOfWordsScanner;

	/**
	 * Takes the path of the file
	 * 
	 * @param filePath
	 *            filepath for the word file
	 * @throws FileNotFoundException
	 */
	public WordFinder(String filePath) throws FileNotFoundException
	{
		this.setFilePath(filePath);
	}

	/**
	 * Gets the file name Throughs exception if path is missing.
	 * 
	 * @return
	 * @throws FileNotFoundException
	 */
	public String getFilePath() throws FileNotFoundException
	{
		this.checkForFile();
		return filePath;
	}

	/**
	 * Sets file path and check if path is valid.
	 * 
	 * @param filePath
	 * @throws FileNotFoundException
	 */
	public void setFilePath(String newfilePath) throws FileNotFoundException
	{
		this.filePath = newfilePath;
		this.checkForFile();
		loadFile();
	}

	/**
	 * Loads the file and creats the scanner.
	 * 
	 * @throws FileNotFoundException
	 */
	private void loadFile() throws FileNotFoundException
	{
		// För att läsa från filen
		this.listOfWordsScanner = new Scanner(new File(this.getFilePath()));

	}

	/**
	 * Finds the word
	 * 
	 * @param word
	 *            which word your looking for.
	 * @return answer. if found or not and how long it took
	 * @throws FileNotFoundException
	 */
	public String findWord(String word) throws FileNotFoundException
	{

		checkForFile();

		int wordCount = 0;
		final long startTime = System.currentTimeMillis();
		long endTime = 0;

		// listOfWordsScanner.useDelimiter(word.toLowerCase());
		boolean foundWord = false;
		String tempWord;
		while (listOfWordsScanner.hasNext())
		{
			tempWord = listOfWordsScanner.next();
			wordCount++;
			if (tempWord.toLowerCase().contains(word))
			{
				endTime = System.currentTimeMillis();
				foundWord = true;
			}
			// kolla om det är slutet av filen eller inte.
			// if (listOfWordsScanner.hasNext() == true)
			// {
			// foundWord = true;
			// }
		}

		listOfWordsScanner.close();
		final long timeTook = endTime - startTime;
		return returnResultString(word, foundWord, timeTook, wordCount);
	}

	private void checkForFile() throws FileNotFoundException
	{
		if (filePath == null || filePath.isEmpty())
		{
			throw new FileNotFoundException("There is no file");
		}
	}

	private String returnResultString(String word, boolean foundWord,
			final long timeTook, int wordCount)
	{
		if (foundWord)
		{
			return "Found the word= " + word + " and the search took= "
					+ String.format("%2dm", timeTook) + "\nword count is= "
					+ wordCount;
		}
		else
		{

		}
		return "Missing the word= " + word + " and the search took= "
				+ String.format("%2dm", timeTook) + "\nword count is= "
				+ wordCount;
	}
}
