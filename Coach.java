//         Name: Osman Servin
//  Description: Assignment 4 class displays a menu of choices to a user
//   			 and performs the chosen task. It will keep asking a user to
//				 enter the next choice until the choice of 'Q' (Quit) is entered.

public class Coach
{
	private String firstName;
	private String lastName;
	private int yearsCoached = 0;
	public char[] toString;
	
	// THIS METHOD WILL INITIALIZE THE STRING VARIABLES TO ? 
	public Coach()
	{
		this.firstName = "?"; // SETS VALUE OF firstName TO ?
		this.lastName = "?";  // SETS VALUE OF lastName TO ?
	}
	
	// THIS CONSTRUCTOR WILL STORE THE INPUTS INTO DESIGNATED VARIABLES
	public Coach(String first, String last, int years )
	{
		this.firstName = first;    // SETS VALUE OF firstName TO last
		this.lastName = last;      // SETS VALUE OF lastName TO last
		this.yearsCoached = years;  // SETS VALUE OF yearsCoached TO years
	}
	
	// ACCESSOR METHODS INCASE NEEDED IN OTHER CLASSES
	// RETURNS THE FIRST NAME OF COACH
	public String getFirstName()
	{
		return this.firstName;
	}
	// RETURNS THE LAST NAME OF COACH
	public String getLastName()
	{
		return this.lastName;
	}
	// RETURNS THE YEARS COACHED
	public int getYears()
	{
		return this.yearsCoached;
	}
	
	// MUTATOR METHODS TO SET THE VALUES OF VARAIBLES
	// SETS THE STRING OF firstName
	public void setFirstName(String someFirstName)
	{
		this.firstName = someFirstName;
	}
	// SETS THE STRING OF lastName
	public void setLastName(String someLastName)
	{
		this.lastName = someLastName;
	}
	// SETS THE VALUE OF YEARS
	public void setYears(int years) 
	{
		this.yearsCoached = years;
	}
	
	
	// RETURNS THE INFORMATION BACK TO THE USER IN A STRING
	public String toString()
	{
		return String.format("\nLast Name:\t" + lastName 
					       + "\nFirst Name:\t" + firstName
					       + "\nYears of Experience:\t" + yearsCoached + "\n");
	}
			
}
