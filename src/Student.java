//Syed Ahmed
import java.util.*;
public class Student extends Person {

	private String classstatus;
public Student() {}

	public Student(String classstatus, String name, String address,String phonenumber) {
		super(name,address,phonenumber);
		this.classstatus=classstatus;
		
	}

  public void Speak() {
	  System.out.println("A student from the Student subclass, rank "+classstatus);
  }
}
