package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LongestPalindrome {
	public static void main(String[] args) {
		// TestCases
		LongestPalindrome lls = new LongestPalindrome();
		int[] result = new int[3];
		List<String> testcases = new ArrayList();
		testcases = Arrays.asList("satas", "garbage", "somethingada","abba");
		
		for(String testcase:testcases) {
			System.out.println(lls.longestPalindrome(testcase)+"\n");
		}
	}
    public String longestPalindrome(String s) {
    	
    	//memory
    	int [][]mem = new int[s.length()][s.length()];
    	int maxLen = 1;
    	int idx = 0;
    	// initialize
    	for (int i=0;i<s.length();i++) {
    		mem[i][i] = 1;
    	}
    	for (int i=0;i<s.length()-1;i++) {
    		if(s.charAt(i) == s.charAt(i+1)) {
    			mem[i][i+1] = 1;

				if(maxLen < 2) {
	    			idx = i;
	    			maxLen = 2;
    			}
    		}
    	}
    	for (int i1=2;i1<s.length();i1++) {
    		for (int j = 0; j < s.length() - i1 ; j++) {
    			if(s.charAt(j) == s.charAt(j+i1) && mem[j+1][j+i1-1] > 0) {
    				mem[j][j+i1] = 1 + mem[j+1][j+i1-1];
    				if(maxLen < i1+1) {
    					maxLen = i1 + 1;
    					idx = j;
        			}
    			}
			}
    	}
		return s.substring(idx, idx+maxLen);
        
    }
}
