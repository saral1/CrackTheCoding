import java.util.*;

public class URLify{
	/*** Problem 1.3: URLify

	Write a method to replace all spaces in a string with '%20'. You may assume the string has sufficient space at the end to hold additional chars.
	Try to perform this operation in place

	***/
	

	/*** Solution

	Start from the back and fill, when space is reached, use '%20' instead

	Time: O(n) - best should be O(n) since the string has to go through string at least once
	Space: O(1) - In place solution

	@return modified string
	***/
	public String CheckPerm(String s, int len){
		char[] a = s.toCharArray();
		int spaces = 0;
		int i=0;
		while(i<len){
			if(a[i] == ' '){
				spaces++;
			}
			i++;
		}

		//starting from the back, fill until first space is reached
		i = a.length-1; //i for string being written
		int j=len-1; //j for old string place
		while(i>0 && spaces>=1){
			if(a[j] == ' '){
				//write %20
				a[i] = '0';
				a[i-1] = '2';
				a[i-2] = '%';

				//update places
				i = i-3;
				j--;
				spaces--;
			}else{
				a[i] = a[j];
				i--;
				j--;
			}
		}
		return String.valueOf(a);
	}

}