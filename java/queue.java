public class queue {
    int queue [] = new int [5];
    int size;
    int front;
    int rear;
    public void enqueue(int data){
    
            queue[rear]=data;
            rear++;
            size++;
            
        
       
    }
   
    public void printqueue(){
        for(int i =0;i<=size;i++){

            System.out.print(queue[front +i]+" ");
        }
    }
    public int Dequeue(){
        int data = queue[front];
      
            front++;
            size--;
           
            
        
        return data;
       

    }
   
    public static void main(String[] args) {
        queue newqueue = new queue();
        newqueue.enqueue(6);
        newqueue.enqueue(7);
        newqueue.enqueue(67);
       
        // newqueue.Dequeue();
        // newqueue.Dequeue();
        newqueue.printqueue();
    }
}
