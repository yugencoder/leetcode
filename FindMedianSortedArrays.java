package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindMedianSortedArrays {
	public static void main(String[] args) {
		// TestCases
		FindMedianSortedArrays fmsa = new FindMedianSortedArrays();
		int[] result = new int[3];
		//List<String> testcases = new ArrayList();
		//testcases = Arrays.asList("abcabcbb", "bbbbb", "pwwkew","abba");
		int[][] testcases = {{50,60,55,67},{62,65,70,70}};
			System.out.println(fmsa.findMedianSortedArrays(testcases[0],testcases[1])+"\n");
	}
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    	int len1 = nums1.length;
    	int len2 = nums2.length;
    	int res1 = 0,res2 = 0,mid1,mid2;
    	//Odd Case
    	
    	//Even Case
    	
    	
		return 0;
        
    }


}
