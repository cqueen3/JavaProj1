package project1;

import java.util.Scanner;
import java.util.Vector;

public class ProjectTester {
	
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	CTList newList = new CTList("./Project1/Infected_List.txt");
	
	// This is a test to input data to see if it saves to the data file
//	System.out.print("How many People do you want to enter into the list?");
//	int number = scan.nextInt();
//	
	Infected_ind test = new Infected_ind();
//	for (int i = 0; i < number; i++)
//	{
//		System.out.println("Enter ID: ");
//		String ID = scan.next();
//		test.setSchoolID(ID);
//		System.out.println("Enter First Name: ");
//		String FN = scan.next();
//		test.setFn(FN);
//		System.out.println("Enter Last Name: ");
//		String LN = scan.next();
//		test.setLn(LN);
//		System.out.println("Does live on campus? (True or False: ");
//		String loc = scan.next();
//		if (loc.equals("T"))
//			test.setIn_quarantine(true);
//		else if (loc.equals("F"))
//			test.setIn_quarantine(false);
//		System.out.println("Is in quarantine currently? (T or F): ");
//		String inq = scan.next();
//		if (inq.equals("T"))
//			test.setIn_quarantine(true);
//		else if (inq.equals("F"))
//			test.setIn_quarantine(false);
//		System.out.println("Enter quarantine start date (N/A if not in quar): ");
//		//fix = scan.next();
//		String qsd = scan.next();
//		test.setQuarantine_start_date(qsd);
//		System.out.println("How many close contacts do you wish to add?: ");
//		
//	}
	
	test.setFn("Terry");
	test.setLn("Jones");
	test.setSchoolID("1839302");
	test.setLives_campus(false);
	test.setIn_quarantine(false);
	test.setQuarantine_start_date("September 11");
	Vector<String> conts = new Vector<String>();
	conts.add("Mark Smith 870-401-4040");
	conts.add("Mark Doderer 501-222-5583");
	test.setClose_contacts(conts);
	
	
	
	
	
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
