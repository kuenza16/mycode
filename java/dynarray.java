public class dynarray {
    int capacity = 2;
    int stack[]= new int [capacity];
    int top=0;

    public void push(int data){
        if (size()== capacity) {
            expand();
            
        } else {
            stack[top]=data;
            top++;
            
        }
        

    }
    public void expand(){
        int length = size();
        int newstack[]= new int[capacity*2];
        System.arraycopy(stack, 0, newstack, 0, length);
        stack =newstack;
        capacity *=2;
    }
    public void printstack(){
        for(int n:stack){
            System.out.print(n +" ");
        }
    }
    public int pop(){
        int data=0;
        if (isEmpty()) {
            System.out.println("Stack is empty..");
            
        } else {
            
            top--;
            data = stack[top];
            stack[top]=0;
            shrink();
            
            
        }
        return data;
       

    }
    private void shrink() {
        int length = size();
        if(length<=(capacity/2)/2){
            capacity = capacity/2;
           

        }
        int[] newstack = new int[capacity];
        
        System.arraycopy(stack, 0, newstack, 0, length);
        stack =newstack;
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
        dynarray dystack = new dynarray();
        dystack.push(6);
        dystack.push(6);
        dystack.push(6);
        dystack.push(6);
        dystack.push(6);
        dystack.push(6);
        dystack.push(5);
        dystack.pop();
        dystack.printstack();
    }
    
}
