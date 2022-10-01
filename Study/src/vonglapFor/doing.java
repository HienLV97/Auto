package vonglapFor;
import java.util.Scanner;
import java.util.Iterator;
// chep phat
public class doing 
{
	public static void main(String[] args)
	{
		int solan = 0;

		while (true){
			try { 
				System.out.print("Input so lan muon chep phat:");
				Scanner sc = new Scanner(System.in);
				solan = Integer.parseInt(sc.nextLine());
				break;
				
			} catch(Exception e){
				System.out.println("vui long nhap lai");
			}
		}
		for (int i = 1; i <= solan; i ++ ) {
			System.out.println("chep phat lan:"+i);
		}
		
//		for (int i = 200; i > 0; i--) {
//			System.out.println("chep phat lan:"+i);
//		}
	}

