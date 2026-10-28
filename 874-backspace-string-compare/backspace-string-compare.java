class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<String> stackS = new Stack<>();
        Stack<String> stackT = new Stack<>();


        int i = 0;
        int j = 0;
        while (i < s.length()){
             if (!String.valueOf(s.charAt(i)).equals("#")) {
                stackS.push(String.valueOf(s.charAt(i)));
            }else{
                if (stackS.size() > 0){
                    stackS.pop();
                }
            }
            i++;
        } 
           

        while (j < t.length()){
            if (!String.valueOf(t.charAt(j)).equals("#")) {
                stackT.push(String.valueOf(t.charAt(j)));
            }else{
                if (stackT.size() > 0){
                    stackT.pop();
                }
            }
            j++;
        }

        String stringS = "";
        while (stackS.size() > 0){
            stringS += stackS.peek();
            stackS.pop();
        }

        String stringT = "";
        while (stackT.size() > 0){
            stringT += stackT.peek();
            stackT.pop();
        }

        if (stringT.equals(stringS)){
            return true;
        }else{
            return false;
        }
        
    }
}