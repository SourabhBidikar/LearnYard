package DailyCodes010124;

public class PrintPrimeNumbers {

	public static void main(String[] args) {
		
		System.out.println("Program to print prime numbers from 1 to 100.");
		
		for(int i=2;i<=100;i++) {
			if(isPrime(i)) System.out.println(i);
		}
		
		
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
