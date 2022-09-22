package packageCasting;

import java.util.Scanner;

public class Rectangle extends Shape {
	
	public int areaRect() {
		Scanner scan = new Scanner(System.in);
		Rectangle r = new Rectangle();
		System.out.print("Enter thr num1 and num2 : ");
//		scan.close();
		int ans =  r.setgetNum1(scan.nextInt()) * r.setgetNum2(scan.nextInt());
		scan.close();
		return ans;
	}
}
