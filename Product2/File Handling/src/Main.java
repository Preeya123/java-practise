import java.io.FileInputStream;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		try {
			System.out.println("Enter the file name");
			Scanner sc = new Scanner(System.in);
			String s = sc.nextLine();
			FileInputStream fin = new FileInputStream("C:\\preeya\\File Handling\\src\\"+s);
			int i=0;
			while((i=fin.read())!=-1)
			{
				System.out.print((char)i);
			}
			fin.close();
		}catch(Exception e) {System.out.println(e);}
		}
	}


