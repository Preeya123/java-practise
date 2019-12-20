import java.util.*;
public class Product2yes{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the product id");
        long id = Integer.parseInt(sc.nextLine());
        
        System.out.println("Enter the product name");
        String pname=sc.nextLine();
        
        
        System.out.println("Enter the Supplier name");
        String sname=sc.nextLine();
   
		ProductYes2 p=new ProductYes2(id,pname,sname);
		p.display();
	}

}
