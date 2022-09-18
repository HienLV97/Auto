package InputDataToArr;
import java.util.Scanner;

public class InputDataToArr {

	int b,c;
    public static void main(String args[]) {  
    		Scanner sc = new Scanner(System.in);
            System.out.print("Nhập số phần tử của mảng: ");
            int n = sc.nextInt();
            //khởi tạo arr
            int [] arr = new int [n];
            //System.out.print("Nhập các phần tử của mảng: \n");
            for (int i = 0; i < n; i++) {
                System.out.printf("a[%d] = ", i);
                arr[i] = sc.nextInt();
            }
    	
}
