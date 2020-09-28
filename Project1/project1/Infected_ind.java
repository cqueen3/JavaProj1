package project1;

import java.util.*;
public class Infected_ind {

	private String schoolID;
	private String fn; // First name
	private String ln; // Last name
	private Boolean lives_campus; // Does the user live on campus?
	private Boolean in_quarantine; // Is the current user in quarantine?
	private String quarantine_start_date; // String date that the user began quarantining
	private Vector<String> close_contacts = new Vector<String>(); // For close contacts
	
	
	// SchoolID, First name, Last name, lives on campus, in_quarantine, quarantine_start_date, close contacts list
	//NTC constructors
	public Infected_ind(){
		fn = "Not set";
		ln = "Not set";
		schoolID = "N/A";
		lives_campus = null;
		in_quarantine = null;
		close_contacts.clear();
	}
	
	public Infected_ind(String sid, String fn, String ln, Boolean lc, Boolean iq, String qsd, Vector<String> cc) {
		this.setSchoolID(sid);
		this.setFn(fn);
		this.setLn(ln);
		this.setLives_campus(lc);
		this.setIn_quarantine(iq);
		this.setQuarantine_start_date(qsd);
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
	public void setFn(String fn) {
		this.fn = fn;
	}
	
	
	public String getLn() {
		return ln;
	}
	public void setLn(String ln) {
		this.ln = ln;
	}
	
	public boolean Contains(String FN, String LN) {
		
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
		return lives_campus;
	}
	public void setLives_campus(Boolean lives_campus) {
		this.lives_campus = lives_campus;
	}
	
	
	public Boolean getIn_quarantine() {
		return in_quarantine;
	}
	public void setIn_quarantine(Boolean in_quarantine) {
		this.in_quarantine = in_quarantine;
	}
	
	
	public String getQuarantine_start_date() {
		return quarantine_start_date;
	}
	public void setQuarantine_start_date(String quarantine_start_date) {
		this.quarantine_start_date = quarantine_start_date;
	}
	
	
	public Vector<String> getClose_contacts() {
		return close_contacts;
	}
	public void setClose_contacts(Vector<String> cc) {
		this.close_contacts.addAll(cc);
	}
	
	public void AddContact(String s) {
		close_contacts.add(s);
	}

}
