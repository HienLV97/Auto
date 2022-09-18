package ptbac2;
import java.util.Scanner;
public class doing {
	public static void main(String[] args) {
		double a = 0, b = 0, c = 0, delta = 0, x = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Phuong trinh bac 2: ax^2 + bx + c = 0");	
		while (true) {
			try {
				System.out.print("Input a");
				a = Double.parseDouble(sc.nextLine());
				break;
			}catch (Exception e) {
				System.out.println("Gia tri ko hop le!");
			}
		} 
		while (true) {
			try {
				System.out.print("Input b: ");
				b = Double.parseDouble(sc.nextLine());
				break;
			}catch (Exception e){
				System.out.println("Gia tri ko hop le");
			}
		} 
		while (true) {
			try {
				System.out.print("Input C");
				c = Double.parseDouble(sc.nextLine());
				break;
			}catch (Exception e){
				System.out.println("Gia tri ko le");
			}
		}
		// Phuong trinh bac 2: ax^2 + bx + c = 0
		// Các biến cần có: a, b, c, x1, x2, delta
		/*
		 * Nếu a == 0 thì báo lỗi. B1. delta = b^2 - 4ac B2. Kiem tra delta 2.1. delta
		 * <0 => Phương trình vô nghiệm 2.2. delta ==0 => Phương trình có nghiệm kép
		 * x1=x2=-b/2a 2.3. delta>0 => Phuong trình có 2 nghiệm x1 =
		 * (-b-sqrt(delta))/(2a) x2 = (-b+sqrt(delta))/(2a)
		 */
		delta = Math.pow(b, 2) - 4 * a * c;
		if (a == 0) {
					if (b != 0) {
								if (c == 0) {
											System.out.println("Pt co nghiem: x = ");
								}
								else {
										x = -b/a;
										System.out.println("Pt co nghiem: "+x);
									}
								}
					else {
							if (c ==0) {
										System.out.println("Pt vo so nghiem");
										}
							else {
									System.out.println("Pt vo nghiem");
								}
					}
		}
		else {
				if (delta == 0) {
					x = -b/(2*a);
					System.out.println("Pt co nghiem kep:"+x);
				}
					else if ( delta < 0) {
						System.out.println("Pt vo nghiem");
					}
					else {
						System.out.println("Pt ");
					}
				
		}
	}
}
