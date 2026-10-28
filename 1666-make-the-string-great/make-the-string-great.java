class Solution {
    public String makeGood(String s) {
        Stack<Character> stack = new Stack<>();
        int i = 0;

        for (; i < s.length(); ) {
            stack.push(s.charAt(i));

            if (stack.size() >= 2) {
                if ((int) stack.get(stack.size() - 1) + 32 == (int) stack.get(stack.size() - 2) ||
                    (int) stack.get(stack.size() - 2) + 32 == (int) stack.get(stack.size() - 1)) {
                    stack.pop();
                    stack.pop();
                }
            }
            i++;
        }


        Stack<String> invertStack = new Stack<>();
        while (stack.size() > 0) {
            invertStack.push(String.valueOf(stack.peek()));
            stack.pop();
        }    

        String res = "";
        while (invertStack.size() > 0) {
            res += invertStack.peek();
            invertStack.pop();
        }

        return res;
    }
}