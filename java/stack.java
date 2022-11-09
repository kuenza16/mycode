public class stack {
    int stack[]= new int[5];
    int top =0;
    public void push(int data){
        if (top==5) {
            System.out.println("stack is full..");
            
        } else {
            stack[top]=data;
            top++;
            
        }
        

    }
    public void printstack(){
        for(int n:stack){
            System.out.println(n +" ");
        }
    }
    public int pop(){
        int data=0;
        if (top<=0) {
            System.out.println("Stack is empty..");
            
        } else {
            
            top--;
            data = stack[top];
            stack[top]=0;
            
            
        }
        return data;
       

    }
    public int peek(){
        int data;
        data = stack[top-1];
        return data;
    }
    public int size(){
        return top;
    }
    public boolean isEmpty(){
        return top<=0;
    }
    public static void main(String[] args) {
        stack newstack = new stack();
        newstack.push(5);
        newstack.push(2);
        newstack.push(3);
        newstack.push(4);
        // System.out.println(newstack.peek());

       
        newstack.pop();
        newstack.printstack();
        System.out.println(newstack.size());
        System.out.println(newstack.isEmpty());
        
    }
}
