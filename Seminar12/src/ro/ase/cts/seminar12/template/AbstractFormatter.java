package ro.ase.cts.seminar12.template;

public abstract class AbstractFormatter {
	
	//template method
	public void displayOutput(int input)
	{
		int userInput=getInput(input);
		String formattedInput=formatInput(userInput);
		display(formattedInput);
	}
	
	protected int getInput(int fakeInput)
	{
		System.out.println("Getting input from user");
		return 0;
	}
	
	protected abstract String formatInput(int input);
	protected void display(String input)
	{
		System.out.println(input);
	}

}
