package uppgift1;

public abstract class TextCalculator
{
	String		inputText;

	private int	numberOfLines;

	public TextCalculator()
	{
	}

	public TextCalculator(String inputText)
	{
		this.inputText = inputText;
	}

	public String getInputText()
	{
		return inputText;
	}

	public void setInputText(String inputText)
	{
		this.inputText = inputText;
	}

	/**
	 * Handles the input string and does the calculation on it.
	 * 
	 * @param text
	 * @return
	 * @throws Exception
	 */
	public abstract int doCalculation() throws Exception;

	public int getNumberOfLines() throws Exception
	{
		this.setNumberOfLines(this.doCalculation());
		return numberOfLines;
	}

	public void setNumberOfLines(int numberOfLines)
	{
		this.numberOfLines = numberOfLines;
	}
}
