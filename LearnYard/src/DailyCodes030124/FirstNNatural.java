package DailyCodes030124;

import java.io.BufferedReader;
import java.util.Scanner;

//Sum of first n natural numbers

public class FirstNNatural {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter n:");
		int n=sc.nextInt();
		int sum=n*(n+1)/2;
		System.out.println(sum);
				
	}

}
