import java.util.*;

public class MagixIndex{
	/***Problem 8.1: Triple Step

	A magic index in an array A[0...n-1] is an index such that A[i] = i
		-Given a sorted array of distinct ints
	Write a method to find a magic index, if one exists

	***/


	/***Solution
	
	Since the array is sorted, can use a variation of binary search
	if index of middle element is bigger, look in right half, else look in left half
	repeat until found or end reached

	@return magic index, or -1 if d.n.e
	***/
	public int magicIndex(int[] a, int leftI, int rightI){
		if(rightI >= leftI){
			int midI = (leftI + rightI)/2;
			if(midI == a[midI]){
				return midI;
			}
			if(midI > a[midI]){//if index of middle element is bigger than element, look in right half
				magicIndex(a, midI+1, rightI);
			}else{
				magicIndex(a, leftI, midI-1);
			}
		}
		return -1; //rightI and leftI crossed and magic index not found
	}

}