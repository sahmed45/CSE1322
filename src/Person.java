//Syed Ahmed
import java.util.*;
public class Person {

private String name;
private String address;
private String phonenumber;
public Person() {
	}
public Person(String name, String address, String phonenumber) {
	this.name= name;
	this.address= address;
	this.phonenumber=phonenumber;
}
public String toString() {
	return name + " "+ address+ " "+ phonenumber;
}

public void Speak() {
	System.out.println("Name: "+name+" address: "+address+" phone:"+phonenumber);
}
}


