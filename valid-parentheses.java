import java.util.Stack;

public class ValidParentheses {

	public boolean isValid(String s) {
		Stack<Character> stack = new Stack();

		if(!(s.length()%2==0)) return false;

		for(int i=0; i<s.length(); i++) {
			char ch = s.charAt(i);

			if( ch=='}' || ch==')' || ch==']') {
				if(stack.empty()) return false;

				char openCh = stack.pop();
				if( !((ch=='}' && openCh=='{') || (ch==')' && openCh=='(') || (ch==']' && openCh=='[')) )
					return false;
			} else {
				stack.push(ch);
			}
		}

		if(stack.empty())
			return true;
		else
			return false;
	}
}