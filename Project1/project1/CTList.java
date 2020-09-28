package project1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.Vector;

public class CTList {
		// Manages file I/O of the project
	
	private String fileName;
	private TreeSet<Infected_ind> CT_list;
	private int list_size;
//	
	public CTList()
	{
		fileName = "";
		list_size = 0;
	}
	
	public CTList(String file) {
		fileName = file;
		list_size = 0;
	}
	
	public void setFileName(String fn) {
		fileName = fn;
	}
	
	public void SetCT_list() {
		list_size = 0;
	}
	
	public void SetCT_list(TreeSet<Infected_ind> s) {
		this.CT_list = s;
	}
	
	public void Add(Infected_ind RHS) {
		CT_list.add(RHS);
	}
	
	
	
//	public void Del_ind (String FN, String LN) {
//		Iterator <Infected_ind> del = CT_list.iterator();
//		int count = 0;
//		while (del.hasNext()) {
//			Infected_ind test = del.next();
//				if (test.Contains(FN, LN))				
//					CT_list.remove(test);
//					break;
//		}
//	}
	
	
	
	// SchoolID, First name, Last name, lives on campus, in_quarantine, quarantine_start_date, close contacts list
	
	private void readFile () {
		BufferedReader lineReader = null;
		try {
			FileReader fr = new FileReader(fileName);
			lineReader = new BufferedReader(fr);
			String line = null;
			while ((line = lineReader.readLine())!=null) {
			String[] tokens = line.split(",");
			String SID = tokens[0];
			String FN = tokens[1];
			String LN = tokens[2];
			boolean inf = Boolean.parseBoolean(tokens[3]);
			boolean inq = Boolean.parseBoolean(tokens[4]);
			String qsd = tokens[5];
			Vector<String> cont = new Vector<String>();
			for (int i = 6; i < tokens.length; i++) {
				cont.add(tokens[i]);
			}
			Infected_ind ind = new Infected_ind(SID, FN, LN, inf, inq, qsd, cont);
			CT_list.add(ind);
			}			
		} catch (Exception e) {
			System.err.println("there was a problem with the file reader, try different read type.");
					}
	} // end of readFile method	
	
	public void writeFile () {
		// overloaded method: this calls doWrite with file used to read data
		// use this for saving data between runs
		doWrite(fileName);
	} // end of writeFile method

	public void writeFile(String altFileName) {
		// overloaded method: this calls doWrite with different file name 
		// use this for testing write
		doWrite(altFileName);		
	}// end of writeFile method
	
	private void doWrite(String fn) {
		// this method writes all of the data in the persons array to a file
		Iterator <Infected_ind> iter = CT_list.iterator();
		try
		{
			FileWriter fw = new FileWriter(fn);
			BufferedWriter myOutfile = new BufferedWriter(fw);			
			
			for (int i = 0; i < CT_list.size(); i++) {
				Infected_ind person = iter.next();
				myOutfile.write (person.getSchoolID() + ",");
				myOutfile.write (person.getFn() + ",");
				myOutfile.write (person.getLn() + ",");
				myOutfile.write (person.getLives_campus() + ",");
				myOutfile.write (person.getIn_quarantine() + ",");
				myOutfile.write (person.getQuarantine_start_date() + ",");
				myOutfile.write (person.getClose_contacts() + ",/n");
					
			}
			myOutfile.flush();
			myOutfile.close();
		}
		catch (Exception e) {
			e.printStackTrace();
			System.err.println("Didn't save to " + fn);
		}
	}
}