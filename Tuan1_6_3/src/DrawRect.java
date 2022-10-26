import java.util.Scanner;

public class DrawRect {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("How tall is rect (odd number)?");
		int iHeight = keyboard.nextInt();
		
		while (iHeight%2==0) {
			System.out.println("How tall is rect (odd number)?");
			iHeight = keyboard.nextInt();
		};
		
		keyboard.close();
		int iMax = 2*iHeight + 1;
		int iRemain = 0;
		for (int i = 0; i < iHeight; i++) {
			iRemain = (iMax - 2*i - 1)/2;
			for (int j = 1; j <= iRemain; j++) {
				System.out.print(" ");
			} 
			for (int k = 1; k <= 2*i + 1; k++) {
				System.out.print("*");
			}
			for (int l = 1; l <= iRemain; l++) {
				System.out.print(" ");
			}
			System.out.print("\n");
		}
	}
}
