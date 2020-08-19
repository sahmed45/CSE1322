
public class Staff extends Employee {
private String title;
public Staff() {
}
public Staff(String title,int office, int salary, int datehired,String name, String address,String phonenumber) {
	super(office,salary,datehired,name,address,phonenumber);
		this.title=title;
}
public void Speak() {
	System.out.println("A staff member from the staff subclass, title "+title);
}
}