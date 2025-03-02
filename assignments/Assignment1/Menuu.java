import java.util.Scanner;

public class Menuu {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		 String[] menu= {"Dosa","Idli","Poha","Tea"};
		 double[]prices= {50.0,30.0,20.0,10.0};
	
				System.out.println("Food menu:");
				for(int i=0; i<menu.length; i++)
					{
						System.out.println((i+1) + "."+menu[i] + " _ Rs. " + prices[i]);
					}
				System.out.println((menu.length + 1) + ".Generate Bill");
				System.out.println("Enter your choice (1-" + (menu.length + 1) + "): ");
				int choice = sc.nextInt();
				if (choice >= 1 && choice <=menu.length)
				{
					System.out.println("Enter quantity:");
					int quantity =sc.nextInt();
					System.out.println("Total Quantity");
					System.out.println(+quantity);
					double generatebill = prices[choice -1] * quantity;
					System.out.println("Total Bill amount" );
					System.out.println(+generatebill);
					
				}
				else 
				{
					System.out.println("Invalid choice. please try again.");
				}
				
			
				System.out.println("Thank you for Ordering");

	}
}

