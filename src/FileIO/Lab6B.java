package FileIO;
import java.io.*;
import java.util.Scanner;
public class Lab6B {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		File f = new File("textfile.txt");
		File ff = new File("textfile2.txt");

		if(f.exists()==true)
		{
			System.out.println("The file : "  + f.getName() +" exists.");
			}
		else{
			System.out.println("The file : "  + f.getName() +" does not exist press c to continue or enter to abort.");
			char a = sc.next().charAt(0);
			if (a=='c') {
				System.out.println("Enter new file name");
				String s = sc.nextLine();
				FileWriter fw=new FileWriter(s);
			}
		} 
		if(ff.exists()==true)
		{
			System.out.println("The file : "  + ff.getName() +" exists");

				System.out.println("Enter new file name or enter same name");
				String s = sc.nextLine();
				FileWriter fw=new FileWriter(s);			
		}
		else{
			System.out.println("The file : "  + ff.getName() +" does not exist.");	
				System.out.println("Enter new file name");
				String s = sc.nextLine();
				FileWriter fw=new FileWriter(s);
				System.out.println(s+ " created");
			}
		   FileReader frs = new FileReader(f);
		   BufferedReader br = new BufferedReader(frs);
		   String S; 
		   BufferedWriter bw;
		   bw = new BufferedWriter( new FileWriter( ff));
		   while(( S = br.readLine()) !=null) 
		    { 
			   
			    bw.write( S);
		    } 
		   frs.close();
		   bw.close();
		   System.out.println("Copied " +f.getName()+ " to"+ " "+ ff.getName());

		
		} 
	}


