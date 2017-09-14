class Solution {
    
    Stack<Integer> stack = new Stack<>();
    
    public int calculate(String s) {
        
        if (s.length() == 1) return Integer.parseInt(s);
        
        boolean isSpace = false;
        
        char preOperator = ' ';
        String number = "";
        
        for(int i=0; i<s.length(); i++) {
            char current = s.charAt(i);
            
            if (current == ' ') continue;
            
            if (isOperator(current)) {
                operate(number, preOperator);
                
                number = "";
                preOperator = current;
            } else {
                number += current;
            }
        }
        
        operate(number, preOperator);
        
        int result = 0;
        while(!stack.isEmpty())
            result += stack.pop();
     
        return result;
    }
    
    private boolean isOperator(char op) {
        boolean result = false;
        
        if (op == '+' || op == '-' || op == '*' || op == '/')
            result = true;
        
        return result;
    }
    
    private void operate(String number, char preOp) {
        int after = Integer.parseInt(number);
        int operatedNumber = operate(preOp, after);
                
        stack.push(operatedNumber);
    }
    
    private int operate(char op, int after) {
        if (op == ' ' || op == '+') return after;
        
        if (op == '-') return -after;
        
        int pre = stack.pop();
        if (op == '*') return pre * after;
        else return pre / after;
    }
}