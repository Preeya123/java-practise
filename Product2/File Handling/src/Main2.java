import java.io.FileInputStream;
import java.util.Scanner;
import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
public class Main2 {

	public static void main(String[] args) {
		try {
			System.out.println("Enter the file name");
			Scanner sc = new Scanner(System.in);
			String s = sc.nextLine();
			FileWriter fw=new FileWriter("C:\\preeya\\File Handling\\src\\player.csv"); 
			fw.write("Enter the player name.");
			fw.write("Enter the Team name."); 
			fw.write("Enter number of matches played.");    
	        fw.close();    
			int i=0;
			FileWriter fr = null;
			while((i=fw.write(null))!=-1)
			{
				System.out.print((char)i);
			}
			fw.close();
		}catch(Exception e) {System.out.println(e);}
		}
	

	}


