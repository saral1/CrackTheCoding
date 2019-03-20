import java.util.*;

public class ParenCombinations{
	/***Problem 8.9: Parnes

	Print all valid (properly opened and closed) combinations of n pairs of parentheses {}

	***/


	/***Solution

	Keep track of number of parentheses with open count for { and close count for }
	Recur call until closed count = n (all brackets are used up)
		-if open bracket count becomes more than closed, put a closing bracket and recur with closedCount+1
		-if open bracket count is still less than n, put an open bracket and recur with openCount+1
	
	@return n/a
	***/
	public void printCombParentheses(char[] store, int n){
		if(n > 0){
			printCombParenthesesUtil(store, 0, n, 0, 0);
		}

	}
	private static void printCombParenthesesUtil(char[] store, int pos, int n, int openCount, int closedCount){
		if(closedCount == n){
			//done, print stored brackets
			for(int i=0; i<store.length; i++){
				System.out.print(store[i]);
			}
			System.out.println();
			return;
		}else{
			//if open bracket count becomes more than closed, put a closing bracket, and recur for with closeCount+1
			if(openCount > closedCount){
				store[pos] = '}';
				printCombParenthesesUtil(store, pos+1, n, openCount, closedCount+1);
			}
			//if open bracket count is lessn than n, put an open bracket, and recur for openCount+1
			if(openCount < n){
				store[pos] = '{';
				printCombParenthesesUtil(store, pos+1, n, openCount+1, closedCount);
			}
		}
	}
}