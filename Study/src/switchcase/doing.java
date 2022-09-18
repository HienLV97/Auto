package switchcase;
import java.util.Scanner;
public class doing {
	public static void main(String[] args) {
		int year, month;
		Scanner sc = new Scanner(System.in);
		String nhuan ="La thang 31";
		while (true) {
			try {
				System.out.println("Input year: ");
				year = Integer.parseInt(sc.nextLine());
				System.out.println("Input Month: ");
				month = Integer.parseInt(sc.nextLine());
				{switch (month) {
				case 1:
					System.out.println(nhuan);
					break;
				case 3:
					System.out.println(nhuan);
					break;
				case 5:
					System.out.println(nhuan);
					break;
				case 7:
					System.out.println(nhuan);
					break;
				case 8:
					System.out.println(nhuan);
					break;
				case 10:
					System.out.println(nhuan);
					break;
				case 12:
					System.out.println(nhuan);
					break;
				case 2:
					if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
						System.out.println("Co 29 ngay");
					}else {
						System.out.println("Co 28 ngay");
					}		
				default:
					System.out.println("Gia tri ko hop le");
					break;
				}
				}
				break;
			}catch(Exception e){
				System.out.println("Eror");
			}
		}
	}
}
