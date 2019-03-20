import java.util.*;

public class PrintFibbonacci{
	/***Problem 

	Print Fibbonacci sequence

	***/


	/***Solution
	
	Fibbonacci sequence 1,1,2,3,5 where starting at second 1, each number at n is equal to (n-1) + (n-2)
	Base Cases: if place is at 1 or 2, then it's 1
	Every Other Case: equal to previous number + previous previous number

	@return magic index, or -1 if d.n.e
	***/
	public static void printFibbonacciRec(int n){
		for(int i=1; i<=n; i++){
			System.out.print(fibbonacci(i) + " ");
		}
		System.out.println();
	}

	//n is the nth number
	private static int fibbonacci(int n){
		if(n == 1 || n == 2){
			return 1;
		}
		return fibbonacci(n-1) + fibbonacci(n-2);
	}

}