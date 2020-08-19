package Abstract;
//Syed Ahmed

import java.util.*;


public class Lab2BMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Octagon o1= new Octagon(5);
		System.out.println("Area o1 is " + o1.area());
		System.out.println("Perimeter o1 is " +o1.perimeter());
		o1.clone();
		if(o1.compareTo(o1)==1){
			System.out.println("the clone is equal");
		}
		else System.out.println("the clone is not equal");
		
	}

}
