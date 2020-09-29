// Corey Queen, 8 AM Java, Project 1
package project1;

import java.util.Scanner;
import java.util.Vector;

public class ProjectTester {

public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	CTList newList = new CTList("./Project1/Infected_List.txt"); // Reads file, uploads any existing contacts
	
	Person test = new Person(); // Created to add first person to list
	
	test.setFn("Terry");
	test.setLn("Jones");
	test.setSchoolID("1839302");
	test.setLives_campus(false);
	test.setIn_quarantine(false);
	test.setQuarantine_sd("September 11");
	Vector<String> conts = new Vector<String>();
	conts.add("Jimmy Fallon 870-401-4040");
	conts.add("Seth Massen 501-222-5583");
	test.setClose_contacts(conts);
	
	newList.Add(test); // Add function adds new contacts to the lis
	
	newList.ToString(); // First line, should print only Terry Jones Upon first run. Multiple runs will print entire list
	System.out.println("\n \n");
	
	Person best = new Person();
	best.setSchoolID("849231");
	best.setFn("Jonny");
	best.setLn("Mater");
	best.setLives_campus(true);
	best.setIn_quarantine(true);
	best.setQuarantine_sd("N/A");
	Vector<String> conts2 = new Vector<String>();
	conts2.add("Juan Soto 870-421-4400");
	conts2.add("Milk man 501-321-3358");
	best.setClose_contacts(conts2);
	
	newList.Add(best);
	
	Person jest = new Person();
	jest.setSchoolID("11223344");
	jest.setFn("Bailey");
	jest.setLn("Smith");
	jest.setLives_campus(false);
	jest.setIn_quarantine(true);
	jest.setQuarantine_sd("Tuesday 11 September");
	Vector<String> conts3 = new Vector<String>();
	conts3.add("Bake Jakeson 564-212-8493");
	conts3.add("Bread Fella 891-383-3449");
	jest.setClose_contacts(conts3);
	
	newList.Add(jest);
	newList.ToString(); // Now list should contain all 3 contacts that have been manually added. 
	System.out.println("\n \n");
	
	System.out.println("\nBefore removal: " + newList.does_contain("11223344")); // A boolean to test whether or not a person with that ID exists
	
	newList.remove("11223344"); // The person to be removed should be Bailey Smith, as their ID is the input string
	
	System.out.println("\nAfter removal: " + newList.does_contain("11223344")); 
	newList.ToString();
	System.out.println("\n \n");
	
	newList.addContact("1839302", "Jason Bourne 445-442-1832"); // Should add contact Jason Bourne to Terry Jones
	newList.ToString();
	
	
	Person find_p_test = newList.find_person("1839302"); // Test to see if the new assigned variable has the properties of the Person of same ID.
	System.out.println("Should read :Terry Jones: " + find_p_test.getFn() + " " + find_p_test.getLn());
	
	find_p_test = newList.find_person("849231"); // Test to see if the new assigned variable has the properties of the Person of same ID.
	System.out.println("Should read :Jonny Mater: " + find_p_test.getFn() + " " + find_p_test.getLn());
	
	newList.writeFile(); // This writes a file to the text file above, also ends program
}
	
}
