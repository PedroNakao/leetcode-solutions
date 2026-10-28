class MyStack {
    private  Queue<Integer> fila = new LinkedList<>();
    private Queue<Integer> filaAux = new LinkedList<>();

    public MyStack() {
        
    }
    
    public void push(int x) {
        int tamanho1 = fila.size();
        while(fila.size() > 0){
            filaAux.offer(fila.poll());
        }
        fila.offer(x);

        while(fila.size() < tamanho1 + 1){
            fila.offer(filaAux.poll());
        }
    }
    
    public int pop() {
        return fila.poll();
    }
    
    public int top() {
        return fila.peek();
    }
    
    public boolean empty() {
        return fila.isEmpty();
        
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */