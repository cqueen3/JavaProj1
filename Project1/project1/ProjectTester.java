package project1;

import java.util.Scanner;

public class ProjectTester {
	
public static void main() {
	Scanner scan = new Scanner(System.in);
	CTList newList = new CTList("./Project1/Infected_List.txt");
	
	// This is a test to input data to see if it saves to the data file
	System.out.print("How many People do you want to enter into the list?");
	int number = scan.nextInt();
	
	for (int i = 0; i < number; i++)
	{
		Infected_ind test = new Infected_ind();
		System.out.println("Enter ID: ");
		String ID = scan.nextLine();
		System.out.println("Enter First Name: ");
		String FN = scan.nextLine();
		System.out.println("Enter Last Name: ");
		String LN = scan.nextLine();
		System.out.println("Does live on campus? (T or F: ");
		boolean loc = scan.nextBoolean();
		System.out.println("Is in quarantine currently?: ");
		boolean inq = scan.nextBoolean();
		System.out.println("Enter quarantine start date (N/A if not in quar): ");
		String qsd = scan.nextLine();
		System.out.println("How many close contacts do you wish to add?: ");
		int contnum = scan.nextInt();
		
			for (int j = 0; j < contnum; j++)
		System.out.println("Enter contact " + j+1 + " info: ") ;
			String con = scan.nextLine();
			test.AddContact(con);
	}
	
	newList.writeFile();
	
	
	
	
	
	
	
}
	
	//Test reading a file
	//Test adding a sample person to that file
	//Test reading a file to make sure all the info that was input was saved to the text file
	//Test adding an infected person to the list
	//Test reading the file to see if that worked
	//Test removing a person from the file
	//Test reading to see if that worked
	//Test queuing through the list to see if the list can find information from that file
	//Test adding close contact to specific tested individual
	//Test changing data from every different data type
	
	
	
	
}
