import java.util.Scanner;

public class Double {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter num1:");
		if(!sc.hasNextDouble())
		{
			System.out.println("error:Enter a valid number");
			return;
			
		}
		double num1=sc.nextDouble();
		System.out.println("enter num2:");
		if(!sc.hasNextDouble())
		{
			System.out.println("error:Enter a valid number");
			return;
			
		}
		double num2=sc.nextDouble();
		System.out.println("num1="+num1);
		System.out.println("num2="+num2);
		
        double avarage=(num1+num2)/2;
        System.out.println("Avarage="+avarage);
	    sc.close();
	}

}

