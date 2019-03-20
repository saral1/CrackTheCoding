import java.util.*;

public class TripleStep{
	/***Problem 8.1: Triple Step

	A child is running up the stairscase with n steps left
		-he can hop 1, 2, or 3 steps at a time
	Count how many possible ways he can run up the stairs

	***/


	/***Solution
	
	For each step, he can hop (n) stairs in 1, 2 or 3 steps (i)
		For the next step, he can hop (n-i) stairs again in 1, 2 or 3 steps
	Notice the repeated problem -> use recusuion
	The number of ways to hop n remaining steps is just #ways(n-3) + #ways(n-2) + #ways(n-1)

	@return number of possible ways to hop n stairs using 1,2,3 steps
	***/
	public int tripleStep(int n){
		//Base cases:
			//0 step left: 1 way to hop nothing
			//1 step left: 1 way to hop 1 step
			//2 step left: 2 way to hop 2 steps (1,1 or 2)
		//Every other case:
			// #ways(n steps) = #ways(n-3 steps) + #ways(n-2 steps) +  #ways(n-1 steps)
		if(n==0){
			return 1;
		}
		if(n==1){
			return 1;
		}else if(n==2){
			return 2;
		}else{
			return tripleStep(n-3)+tripleStep(n-2)+tripleStep(n-1);
		}
	}

}