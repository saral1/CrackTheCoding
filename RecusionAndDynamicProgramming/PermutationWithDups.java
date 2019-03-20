import java.util.*;

public class PermutationWithDups{
	/***Problem 8.8: Permutation With Dups

	Computer all permutations of a string of chars (may or may not be unique)

	***/


	/***Solution
	
	# permutations = n!
	Keep swapping letters since chars are unqiue, the end branch of the resursion tree after n levels/n swaps are the resulting permutations
	In this case, need to check if the 2 chars should be swapped first since s could have duplicates

	@return n/a
	***/
	public void permString(char[] s, int index, int n){
		if(index >= n){
			System.out.println(s);
			return;
		}
		for(int i=index; i<n; i++){
			//proceed further for s[i] only if it doesnt match any of the chars after s[index]
			boolean check = shouldSwap(s, index, i);
			if(check){
				swap(s, index, i);
				permString(s, index+1, n);
				swap(s, index, i);
			}
		}
	}
	//return true if s[current] does not match with any char after s[start] to current
	private boolean shouldSwap(char[] s, int start, int current){
		for(int i=start; i<current; i++){
			if(s[i] == s[current]){
				return false;
			}
		}
		return true;
	}
	private void swap(char[] s, int i, int j){
		char temp = s[i];
		s[i] = s[j];
		s[j] = temp;
	}

}