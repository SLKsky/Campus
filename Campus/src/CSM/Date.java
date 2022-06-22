package CSM;

public class Date {

	int annee;
	int mois;
	int jour;
	int heures;
	int min;
	
	
	Date(int year, int month, int day,  int hrs, int min)
	{
		
	}


	public int getYear() {
		return annee;
	}


	public void setYear(int year) {
		this.annee = year;
	}


	public int getMonth() {
		return mois;
	}


	public void setMonth(int month) {
		this.mois = month;
	}


	public int getDay() {
		return jour;
	}


	public void setDay(int day) {
		this.jour = day;
	}


	public int getHrs() {
		return heures;
	}


	public void setHrs(int hrs) {
		this.heures = hrs;
	}


	public int getMin() {
		return min;
	}


	public void setMin(int min) {
		this.min = min;
	}


	@Override
	public String toString() {
		return "Date [year=" + annee + ", month=" + mois + ", day=" + jour + ", hrs=" + heures + ", min=" + min + "]";
	}


	public Date() {
		super();
		// TODO Auto-generated constructor stub
	}	
	
}
