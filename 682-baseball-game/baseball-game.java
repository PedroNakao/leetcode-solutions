class Solution {
    public int calPoints(String[] operations) {
        //LIFO - Ultimo a entrar, primeiro a sair
        Stack<Integer> pilha = new Stack<>();
        int i = 0;
       
        while(i < operations.length){
            if(operations[i].equals("+")){
                if(pilha.size() >=2){
                    int var1 = pilha.get(pilha.size()-1);
                    int var2 = pilha.get(pilha.size()-2);
                    int valor = var1 + var2;
                    pilha.push(valor);
                }
            }

            if (operations[i].equals("C")){
                pilha.pop();
            }

            if (operations[i].equals("D")){
                int var = pilha.peek() * 2;
                pilha.push(var);
            }

            if (!operations[i].equals("D") && !operations[i].equals("C") && !operations[i].equals("+")){
                pilha.push(Integer.parseInt(operations[i]));
            }
        i++;
        }

        int sum = 0;
        while(pilha.size() > 0){
            int var = pilha.peek();
            pilha.pop();
            sum += var;
        }
        
        return sum;
    }
}