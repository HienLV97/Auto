package ptbac1;
import java.util.Scanner;
public class doing {
	public static void main(String[] args) {
		//ax + b = 0
		Scanner sc = new Scanner(System.in);
	double a = 0, b = 0, c = 0;
	while (true) {
		try {
        	System.out.print("Input a:");
        	//Scanner sc = new Scanner(System.in);
    		a = Double.parseDouble(sc.nextLine());
    		break;
        	}
        catch (Exception e) {
    		System.out.println("Error");
    		}
		}
    while (true) {
        try {
            	System.out.print("Input b:");
            	//Scanner sc = new Scanner(System.in);
        		b = Double.parseDouble(sc.nextLine());
        		break;
            	}
            catch (Exception e) {
        		System.out.println("Error");}    
    			}
    while (true) {
    	try {
    		System.out.print("Input c:");
        	//Scanner sc = new Scanner(System.in);
    		c = Double.parseDouble(sc.nextLine());
    		break;
    	} catch (Exception e) {
    		System.out.println("error");
    	}
    }
       double x = -b/a;
       //ax + b = 0
	if (a == 0) {
		if (b == 0) {
			System.out.println("Phuong trinh vo so nghiem");
		}else {
				System.out.println("Phuong tinh vo nghiem");
				}
	}else{
		System.out.println("Phuong trinh co nghiem = "+x);}
		}
}
