class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        int i = 0;
        while(i<s.length()){
            if(s.charAt(i)=='(' || s.charAt(i)=='[' || s.charAt(i) =='{'){
                stack.push(s.charAt(i));
            }else{
                if(stack.isEmpty()){
                    return false;
                }

            char top = stack.peek();

            if(s.charAt(i)==')' && top=='('){
                stack.pop();
            }else if(s.charAt(i)=='}' && top=='{'){
                stack.pop();
            }else if(s.charAt(i)==']' && top=='['){
                stack.pop();
            }else{
                return false;
            }
              }
            
            i++;
        }
        return stack.isEmpty();
    }
}
