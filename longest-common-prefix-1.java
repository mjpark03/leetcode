
public class Solution {

	public String longestCommonPrefix(String[] strs) {
		String prefix = "";
		boolean check = true;

		if (strs.length==0)
			return prefix;
			
		if(strs.length==1)
		    return strs[0];

		for(int i=0; i<strs[0].length() && check; i++) {
			char c = strs[0].charAt(i);

			for(int j=1; j<strs.length; j++) {
				if (strs[j].length()<(i+1) || c!=strs[j].charAt(i)) {
				    check = false;
				    break;
				}

				if (j==(strs.length-1))
					prefix += c;
			}
		}

		return prefix;
	}
}