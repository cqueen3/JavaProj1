package project1;

import java.util.*;
public class Person {

	private String schoolID; // School ID, also main method of searching through information
	private String fn; // First name
	private String ln; // Last name
	private Boolean lives_campus; // Does the user live on campus?
	private Boolean in_quarantine; // Is the current user in quarantine?
	private String quarantine_start_date; // String date that the user began quarantining
	private Vector<String> close_contacts = new Vector<String>(); // For close contacts
	
	
	// SchoolID, First name, Last name, lives on campus, in_quarantine, quarantine_start_date, close contacts list
	//NTC constructors
	public Person(){
		fn = "Not set";
		ln = "Not set";
		schoolID = "N/A";
		lives_campus = null;
		in_quarantine = null;
		close_contacts.clear();
	}
	
	public Person(String sid, String fn, String ln, Boolean lc, Boolean iq, String qsd, Vector<String> cc) { // Person constructor with all the necessary variables
		this.setSchoolID(sid);
		this.setFn(fn);
		this.setLn(ln);
		this.setLives_campus(lc);
		this.setIn_quarantine(iq);
		this.setQuarantine_sd(qsd);
		this.setClose_contacts(cc);
	}
	
	
	public String getSchoolID() {
		return schoolID;
	}
	
	
	public void setSchoolID(String sch) {
		this.schoolID = sch;
	}
	
	
	public String getFn() {
		return fn;
	}
	public void setFn(String FN) {
		this.fn = FN;
	}
	
	
	public String getLn() {
		return this.ln;
	}
	public void setLn(String LN) {
		this.ln = LN;
	}
	
	public boolean Contains(String FN, String LN) { // Alternate method to compare Persons, with first and last name
		
		if (fn.equals(FN) == true)
		{
			if (ln.equals(LN) == true) {
				return true;
			} else
				return false;
		} else
			return false;
	}
	
	
	public Boolean getLives_campus() {
		return this.lives_campus;
	}
	public void setLives_campus(Boolean RHS) {
		lives_campus = RHS;
	}
	
	
	public Boolean getIn_quarantine() {
		return in_quarantine;
	}
	public void setIn_quarantine(Boolean RHS) {
		this.in_quarantine = RHS;
	}
	
	
	public String getQuarantine_sd() {
		return quarantine_start_date;
	}
	public void setQuarantine_sd(String RHS) {
		this.quarantine_start_date = RHS;
	}
	
	
	public Vector<String> getClose_contacts() {
		return close_contacts;
	}
	public void setClose_contacts(Vector<String> cc) {
		this.close_contacts.addAll(cc);
	}
	
	public void AddContact(String s) {
		this.close_contacts.add(s);
	}

}
