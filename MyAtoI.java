package leetcode;

import java.util.Arrays;
import java.util.List;

public class MyAtoI {

	public static void main(String[] args) {
		MyAtoI atoi = new MyAtoI();
		int res = atoi.convertAtoI("-2147483647");
		System.out.println(res);
		// Test for negatives
		// Test for positives
		// Test for invalid Entries
	}

	public int convertAtoI(String str) {
	    int baseValue = 0;
		int sign = 1, idx = 0;
		
        // skip spaces
        while (idx < str.length() && str.charAt(idx) == ' ') {
			idx++;
		}
         
        // check sign    
		if (idx < str.length() && (str.charAt(idx) == '-' || str.charAt(idx) == '+')) {
			sign = str.charAt(idx++) == '+' ? 1 : -1;
		}
            
        // calculate integer           
		while (idx < str.length()) {
			int digit = str.charAt(idx) - '0';
			if (digit >= 0 && digit <= 9) {
				if ((baseValue  + digit*0.1)  > (Integer.MAX_VALUE/10 + (Integer.MAX_VALUE%10)*0.1)) {
					return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
				}
				baseValue = baseValue * 10 + digit;
			} else 
				break;
			idx++;
		}
		return sign * baseValue;
	}
}
