package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LengthOfLongestSubstring {
	public static void main(String[] args) {
		// TestCases
		LengthOfLongestSubstring lls = new LengthOfLongestSubstring();
		int[] result = new int[3];
		List<String> testcases = new ArrayList();
		testcases = Arrays.asList("abcabcbb", "bbbbb", "pwwkew","abba");
		
		for(String testcase:testcases) {
			System.out.println(lls.lengthOfLongestSubstring(testcase)+"\n");
		}
	}

	public int lengthOfLongestSubstring(String s) {
		int start = 0, end = 0;
		int result = 0;
		Map<Character,Integer> history = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			if(history.containsKey(s.charAt(i))) {
				start = Math.max(history.get(s.charAt(i))+1,start);
			}
			result = (result < (end - start + 1))?(end - start + 1):result;
			history.put(s.charAt(i), i);
			end++;
		}
		return result;
	}
}
