

class Heap{
    int [] heap;
    int n;

    public Heap(int capacity){
        heap = new int[capacity+1];
        n =0;
    }
    public boolean isEmpty(){
        return n ==0;

    }
    public int size(){
        return n;
    }
    public void insert(int x){
        if (n == heap.length -1){
            resize(2*heap.length);
        }
        n++;
        heap[n]=x;
        swim(n);
    }
    void swim(int k){
        while(k>1&& heap[k/2]<heap[k]){
            int temp = heap[k];
            heap [k]=heap[k/2];
            heap[k/2]=temp;
            k=k/2;
        }
    }
    private void resize(int capacity) {
		int [] temp = new int [capacity];
		for(int i = 0; i < heap.length; i++) {
			temp[i] = heap[i];
		}
		heap = temp;
	}
	
	public void printMaxHeap() {
		for(int i = 1; i <= n; i++) {
			System.out.print(heap[i] + " ");
		}
	}
    public int delete(int x){
        // for(int i=1;i<=heap.length;i++){
        //     if(heap[i]==x){
        //         heap.remove(x);
        //     }
        // }
        
            int key = heap[x];
            heap[x]=heap[n-1];
            n--;
            swim(n);
            

  
        return key;     
        

    }
    
    public static void main(String[] args) {
        Heap hp = new Heap(6);
        System.out.println("Before insertion");
        System.out.println("size = "+hp.size());
        System.out.println(hp.isEmpty());
        hp.insert(80);
		hp.insert(70);
		hp.insert(60);
		hp.insert(40);
		hp.insert(30);
		hp.insert(20);
        hp.insert(10);
        hp.insert(100);
        
        System.out.println("After insertion:");
		System.out.println("size = "+hp.size());
        System.out.println(hp.isEmpty());
		hp.printMaxHeap();
        System.out.println(' ');
        System.out.println("after deletion ");
        hp.delete(10);
        System.out.println("size = "+hp.size());
        hp.printMaxHeap();
        
    }
}