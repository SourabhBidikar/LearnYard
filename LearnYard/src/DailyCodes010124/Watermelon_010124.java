package DailyCodes010124;

import java.util.Scanner;

/*Codeforces problem
divide the watermelon in such a way that each of the two parts weighs even number of kilos, 
at the same time it is not obligatory that the parts are equal. 

Input
The first (and the only) input line contains integer number  w(1<=w<=100)
the weight of the watermelon bought by the boys.

Output
Print YES, if the boys can divide the watermelon into two parts, each of 
them weighing even number of kilos; and NO in the opposite case
*/
public class Watermelon_010124 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Watermelon weigth w(1<=w<=100) in kilos: ");
		int w=sc.nextInt();
		if(w%2==0&&w!=2) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
	}

}
