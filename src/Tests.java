//Syed Ahmed
import java.util.*;
public class Tests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int average =0;
			
			
					System.out.println("Enter student's name");
					String name=sc.nextLine();
					
				
				
				
				
				   int grade[] = new int[5];
				   int counter =1;
				   for(int j=0; j<grade.length; j++){
					   
				   System.out.println ("Enter grade "+counter);
				      int value = sc.nextInt();
				      counter++;
				      grade[j] = value;
				      }

				   	average(grade, name);
				   	
				   	
		
	}
	public static void average(int grade[],String name) {
		int sum =0;
		for(int j=0;j<grade.length;j++) {
			sum = grade[j]+sum;
			
		}

		
		int average = sum/5;
		System.out.println("Name\t"+"Test1\t"+"Test2\t"+"Test3\t"+"Test4\t"+"Test5\t"+"Average\t"+"Grade");
		System.out.println(name+"\t"+grade[0]+"\t"+grade[1]+"\t"+grade[2]+"\t"+grade[3]+"\t "+grade[4]+"\t"+average);
		switch(average/10) {
		case 9:
			System.out.print("\t\t\t\t\t\t\t"+"A");
			break;
		case 8:
			
			System.out.print("\t\t\t\t\t\t\t"+"B");
			break;
		case 7:
			System.out.print("\t\t\t\t\t\t\t"+"C");
			break;
		case 6:
			System.out.print("\t\t\t\t\t\t\t"+"D");
			break;
			default:
				System.out.print("\t\t\t\t\t\t\t"+"F");
						break;
		}
		
	}

}
/*int i = 10;
int total=0;
do {  
total+=i;
i--;} 

while (i > 0);
System.out.print("Total "+total);
}
}
*/


/*
int f=6;
int x=2;

for(x = 1; x<=7;x++){

f=f+2*x;

System.out.print(f+" ");

*/


/*
for(int i=0;i<=2;i++){
   for(int j=(i*3);j<=(i*3+3);j++){
   System.out.print(j+ "; ");
   }
   System.out.println();
   }
   }
   }
*/

/*
int x  = 71;
int y=61;
int z= 70;


int max=x;

if(y>x && y>z){
max=y;
}
else if(z>x && z>y){
max=z;
}

System.out.println(max);

}

}
*/


/*
switch(n){
case 1: System.out.println("1");
case 2: System.out.println("2");
break;
case 3: System.out.println("3");
case 4: System.out.println("4");
default: System.out.println("5");
}
}
}
*/
/*
int value =0;
System.out.println("enter");
Scanner sc= new Scanner(System.in);
value= sc.nextInt();

if(value==0){
System.out.println("value is odd");}
else if ((double)value/2==1){
System.out.println("even");
}
else{
System.out.println("what");
}}}
*/