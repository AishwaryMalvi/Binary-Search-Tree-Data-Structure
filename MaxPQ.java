package BinarySearchTree;

public class MaxPQ {
	private Integer[] heap;
	private int n;
	
	public MaxPQ(int capacity) {
		heap = new Integer[capacity + 1] ;
		n=0;
		
	}
	public boolean isEmpty() {
		return n==0;
		
	}
	public int size() {
		return n;
	}
	public void insert(int x) {
		if(n == heap.length-1) {
			resize(2*heap.length);
		}
		n++;
		heap[n] = x;
		swim(n);
		
	}
	private void swim(int k) {
		while(k > 1 && heap [k/2] < heap[k]) {
			int temp = heap[k];
			heap[k] = heap[k/2];
			heap[k/2] = temp;
			k = k/2; 	//coz we need continue shifting up till new Valueinserted is at current position
		}
		
	}
		private void resize(int capacity) {
		Integer[] newheap =  new Integer[capacity];
		for(int i =0 ;i<heap.length;i++) {
			newheap[i] = heap[i];
		}
		heap = newheap; 
		
	}
		public void printMaxHeap() {
			for(int i =1 ;i <= n; i++) {
				System.out.print(heap[i] + " ");
			}
		}
		public static void main(String[] args) {
	
		// TODO Auto-generated method stub
			MaxPQ pq = new MaxPQ(3);
			System.out.println(pq.isEmpty());
			
			pq.insert(5);
			pq.insert(10);
			pq.insert(2);
			pq.insert(6);
			pq.insert(4);
			pq.insert(3);
			System.out.println(pq.size());
			pq.printMaxHeap();
	}

}
