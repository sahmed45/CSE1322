import java.util.*;
public class Test {

	static int g=5;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ar(5);
	}
		
		public static void ar(int n) {
			if(n>0) {

				ar(n-1);
				System.out.print(n+" " );
			}
		}
	}
