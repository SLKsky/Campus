package CSM;

public class Date {

	int year;
	int month;
	int day;
	int hrs;
	int min;
	
	
	Date(int year, int month, int day,  int hrs, int min)
	{
		
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public int getMonth() {
		return month;
	}


	public void setMonth(int month) {
		this.month = month;
	}


	public int getDay() {
		return day;
	}


	public void setDay(int day) {
		this.day = day;
	}


	public int getHrs() {
		return hrs;
	}


	public void setHrs(int hrs) {
		this.hrs = hrs;
	}


	public int getMin() {
		return min;
	}


	public void setMin(int min) {
		this.min = min;
	}


	@Override
	public String toString() {
		return "Date [year=" + year + ", month=" + month + ", day=" + day + ", hrs=" + hrs + ", min=" + min + "]";
	}


	public Date() {
		super();
		// TODO Auto-generated constructor stub
	}	
	
}
