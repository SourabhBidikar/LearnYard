package DailyCodes010124;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter num: ");
		int num=sc.nextInt();
		
		if(isPrime(num)) System.out.println("is prime");
		else System.out.println("Not prime.");
		

	}




	public static boolean isPrime(int num) {
		
		if(num==0||num==1) return false;
		if(num==2) return true;
		
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				return  false;
			}
		
		}
		return true;

}
}