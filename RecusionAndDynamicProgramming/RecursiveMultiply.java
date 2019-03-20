import java.util.*;

public class RecursiveMultiply{
	/***Problem 8.5: Recursive Multiply
	
	Write a function to multiply 2 ints without using *
		-can use addition, subtaction, bit shifting

	***/


	/***Solution
	
	Using the logic that 2*8 = 2+2+2+2+2+2+2+2

	@return the value of x*y
	***/
	public int multiply(int x, int y){
		//anything multiplied with 0 is 0
		if(y == 0){
			return 0;
		}
		//recur for x and y-1 and add
		if(y > 0){
			return (x + multiply(x, y-1));
		}
		//recur for -(x and -y) and add
		if(y < 0){
			return -multiply(x, -y);
		}
		return -1;
	}

}