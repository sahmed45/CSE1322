//Syed Ahmed
import java.util.*;
public class Employee extends Person {

private int office;
private int salary;
private int datehired;
public Employee() {
	}
public Employee(int office, int salary, int datehired, String name, String address,String phonenumber) {
	super(name,address,phonenumber);
	this.office=office;
	this.salary=salary;
			this.datehired=datehired;
}
public String display(){
	return "office number "+office + " salary " + salary+ " "+"date hired " +datehired;
}

public void Speak() {
	System.out.println("An employee from the Employee subclass, office "+office+", salary "+salary+" hired on "+datehired);
}
}
