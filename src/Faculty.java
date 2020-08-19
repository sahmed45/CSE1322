
public class Faculty extends Employee {
private String officehours;
private String rank;

public Faculty() {
}
public Faculty(String officehours, String rank,int office, int salary, int datehired,String name, String address,String phonenumber) {
	super(office,salary,datehired,name,address,phonenumber);
	this.officehours=officehours;
			this.rank=rank;
}
public void Speak() {
	System.out.println("An Faculty member from the Faculty subclass, officehours"+officehours+", rank "+rank);
}
}
