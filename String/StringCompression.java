import java.util.*;

public class StringCompression{
	/*** Problem 1.6: One Away

	Compress a string using the counts of repeated characters. 
		-ie. Compress aabccccaaa to a2b1c5a3
		-if compressed is longer return original
		-assume only uppercase and lowercase letters

	***/
	

	/*** Solution
	
	Use stringbuilder when lots of operations need to be done on a string (faster)

	Time: O(n) - most optimized is O(n) since has to go through string at least once
	Space: O(n) - for compressed string, max is when compressed becomes longer (but would stop at s.length()+2)

	@return original if compressed is longer, else return compressed string
	***/
	public String stringCompress(String s){
		StringBuilder c = new StringBuilder(); //compressed string
		int cL = 0; //length of compressed string

		int count = 0; //count of how many consequtive letters
		int n = s.length();
		for(int i=0; i<n; i++){
			//when there is a change in letter, append before to result
			count++;
			if(i+1 >= n || s.charAt(i)!=s.charAt(i+1)){
				c.append(s.charAt(i));
				c.append(count);
				cL = cL+2;
				//if compressed is longer, return original
				if(cL > n){
					return s;
				}
				count = 0;
			}
		}
		return c.toString();
	}

}