package CheckPrime;
import java.util.Scanner;
public class CheckPrime {

	public static void main(String[] args) {
		int temp;
		boolean isprime=true;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any number:");
		
		int num=scan.nextInt();
		scan.close();
		for(int i=2;i<=num/2;i++)
		{
			temp=num%i;
			if(temp==0)
			{
				isprime=false;
				break;
			}
			
		if(isprime)
			System.out.println(num +" is a prime Number");
		else
			System.out.println(num +" is not aprime Number");
		
			}
		}
		
		

	}


