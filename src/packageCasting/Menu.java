package packageCasting;
import java.util.Scanner;

public class Menu {
	
	public void menu(Shape e) {
		
		if(e instanceof Triangle) {
			Triangle t = (Triangle)e;
			System.out.println(t.areaTri());
		}
		else if(e instanceof Rectangle) {
			System.out.println("Instance working");
			Rectangle r = (Rectangle) e;
			System.out.println( r.areaRect());
		}
		
}
	
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Menu m = new Menu();
		int a =0;
		int choice = 0;

		while(true) {

			System.out.println("\n\n 1.RectAngle 2.Triangle 3.Exit");
			
			System.out.print("Eneter your choice : ");
			a  = scan.nextInt();
			choice = a;

			switch (choice) {

				case 1:{
					m.menu(new Rectangle());
					break;
				}
				case 2:{
					m.menu(new Triangle());
					break;
				}
				case 3:{
					System.exit(0);
					scan.close();
				}
				
				default :{
					System.out.println("Invalid Choice");
					
				}

			}

		}


	}
}
