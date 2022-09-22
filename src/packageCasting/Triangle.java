package packageCasting;

import java.util.Scanner;

public class Triangle extends Shape {
	
	public float areaTri() {
		Scanner scan =new Scanner(System.in);
		Triangle t = new Triangle();
		System.out.print("Enter value of num1: ");
		float ans =  0.5f * t.setgetNum1(scan.nextInt())* t.setgetNum2(scan.nextInt());
		scan.close();
		return ans;
	}

}
