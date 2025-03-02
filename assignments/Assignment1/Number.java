import java.util.Scanner;
class Num{
	static Scanner sc=new Scanner(System.in);
	static int num;
	public void acceptrecord() {
		System.out.println("enter number");
		num=sc.nextInt();
	}
	public void printrecord()
	{
		System.out.println("Given number is:"+num);
		String binary = Integer.toBinaryString(num);
		System.out.println(binary);
		String octal=Integer.toOctalString(num);
		System.out.println(octal);
		String hex=Integer.toHexString(num);
		System.out.println(hex);
    }
}
public class Number {
 public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    Num num=new Num();
		num.acceptrecord();
		num.printrecord();
		
		
	}
}
