import java.util.Scanner;
public class ChrisCesenWk2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stubScanner keyboard = new Scanner(System.in);
		   Scanner keyboard = new Scanner(System.in);   
		
		
		   System.out.println("Enter the  purchase price");
		   System.out.println("Enter the years of service");
		   System.out.println("Enter the salvage price");
		   
		   
		   
		   float purchasePrice = keyboard.nextInt();
		   float  salvageValue = keyboard.nextInt();
		   float  yearsService = keyboard.nextInt();
		   
		   
		   float depofItem = (purchasePrice -salvageValue ) / yearsService;
		   
		   System.out.print(depofItem);
		   
		   
		   //System.out.print((10 -6) / 2 );
		   
		   /*
		   System.out.println("Enter the  distance");
		   System.out.println("Enter the gas rate");
		   System.out.println("Enter the cost");
		   
		   
		   
		   double distanceTrip = keyboard.nextInt();
		   double gasRate = keyboard.nextInt();
		   double gasCost = keyboard.nextInt();
		   
		   
		   double costTrip = (distanceTrip * gasRate ) / gasCost;
		   
		   System.out.print(costTrip);
		   */

	}

}
