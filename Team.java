//         Name: Osman Servin
//  Description: Assignment 4 class displays a menu of choices to a user
//   			 and performs the chosen task. It will keep asking a user to
//				 enter the next choice until the choice of 'Q' (Quit) is entered.

public class Team
{
	private String name;
	private Coach coach;
	private String city;
	
	// CONSTRUCTOR WILL INITIALIZE THE VARIABLES TO "?" OR NULL
	 public Team()
	 {
		 name = "?";
		 coach = null;
		 city = "?";
	 }
	 
	 // CONSTRUCTOR WILL STORE THE VALUES TO ITS DESIGNATED VARIABLES
	 public Team(String name, Coach coach, String cityName)
	 {
		 this.name = name;
		 this.coach = coach;
		 this.city = cityName;
	 }
	
	 // THIS METHOD WILL GET THE NAME OF THE TEAM
	 public String getName()
	 {
		 return this.name;
	 }
	 // THIS METHOD WILL GET THE NAME OF THE COACH
	 public Coach getCoach()
	 {
		 return this.coach;
	 }
	 // THIS METHOD WILL GET THE NAME OF THE TEAM'S CITY
	 public String getCity()
	 {
		 return this.city;
	 }
	 
	 
	 // THIS METHOD WILL SET THE name TO someName
	 public void setName(String someName)
	 {
		 name = someName;
	 }
	 // THIS METHOD WILL SET city TO someCity
	 public void setCity(String someCity)
	 {
		 city = someCity;
	 }
	 // THIS METHOD WILL call for the Coach object in the Coach CLASS AND RETURN COACH'S INFORMATION
	 public void setCoach(String firstName, String lastName, int years)
	 {
		 coach = new Coach();				// CREATES AN OBJECT OF TYPE COACH
		 System.out.print(coach.toString);  // CALLS FOR THE toString METHOD IN THE Coach CLASS
	 }
	 
	 
	 //
	 public String toString()
	 {
		 return String.format("Team's name:\t" + name + " from " + city 
				 			  + "\nCoach Information:" + coach);
	 }
	

}
