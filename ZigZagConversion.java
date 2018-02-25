package leetcode;

	import java.util.Arrays;
import java.util.List;

	public class ZigZagConversion {
		public static void main(String[] args) {
			// TestCases
			ZigZagConversion lls = new ZigZagConversion();
			int[] result = new int[3];
			String res = convert("PAYPALISHIRING",3);
			System.out.println(res);
		}
	    public static String convert(String s, int numRows) {
	    	StringBuffer[] str = new StringBuffer[numRows];
	    	for (int i = 0; i < numRows; i++) {	
	    		str[i] = new StringBuffer();	
			}
	    	StringBuffer res = new StringBuffer();
	    	
	    	//
	    	int idx = 0;
	    	
	    	while(idx < s.length()) {
	    		//going down
	    		for (int i = 0; i < numRows && idx < s.length(); i++,idx++) {	
	    			str[i].append(s.charAt(idx));
	    		}
	    		for (int i = numRows-2; i > 0 && idx < s.length(); i--,idx++) {	
	    			str[i].append(s.charAt(idx));
	    		}
	    	}
	    	
	    	//Join to get result
	    	for (int i = 0; i < numRows; i++) {
	    		res.append(str[i]);
			}
			return res.toString();
	        
	    }
	}
