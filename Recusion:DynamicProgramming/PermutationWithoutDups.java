import java.util.*;

public class PermutationWithoutDups{
	/***Problem 8.7: Permutation Without Dups

	Computer all permutations of a string of unique chars

	***/


	/***Solution
	
	# permutations = n!
	Keep swapping letters since chars are unqiue, the end branch of the resursion tree after n levels/n swaps are the resulting permutations

	@return n/a
	***/
	public void permUniqueString(String s, int leftI, int rightI){
		if(leftI == rightI){
			System.out.println(s);
		}else{
			for(int i=1; i<=rightI; i++){
				s = swap(s, leftI, i);
				permUniqueString(s, leftI+1, rightI);
				s = swap(s, leftI, i);
			}
		}
	}
	//swaps char at i and j of string s
	private static String swap(String s, int i, int j){
		char temp;
		char[] sArr = s.toCharArray();
		temp = sArr[i];
		sArr[i] = sArr[j];
		sArr[j] = temp;
		return String.valueOf(sArr);
	}

}