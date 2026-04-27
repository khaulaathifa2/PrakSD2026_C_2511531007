package pekan4_2511531007;

public class QueueArray_2511531007 {
	int front_1007, rear_1007, size_1007;
	int capacity_1007;
	int array_1007[];
	
	public QueueArray_2511531007(int capacity_1007) {
		this.capacity_1007 = capacity_1007;
		front_1007 = this.size_1007 = 0;
		rear_1007 = capacity_1007 - 1;
		array_1007 = new int[this.capacity_1007];
	}
	
	boolean isFull_1007(QueueArray_2511531007 queue_1007) {
		return (queue_1007.size_1007 == queue_1007.capacity_1007);
	}
	
	boolean isEmpty_1007(QueueArray_2511531007 queue_1007) {
		return (queue_1007.size_1007 == 0);
	}
	
	void enqueue_1007(int item_1007) {
		if (isFull_1007(this)) 
			return;
		this.rear_1007 = (this.rear_1007 + 1) % this.capacity_1007;
		this.array_1007[this.rear_1007] = item_1007;
		this.size_1007 = this.size_1007 + 1;
		System.out.println(item_1007 + " enqueued to queue");
	}	
	int dequeue_1007() {
		if (isEmpty_1007(this)) 
			return Integer.MIN_VALUE;
		int item_1007 = this.array_1007[this.front_1007];
		this.front_1007 = (this.front_1007 + 1) % this.capacity_1007;
		this.size_1007 = this.size_1007 - 1;
		return item_1007;
	}
	
	int front_1007() {
		if (isEmpty_1007(this))
			return Integer.MIN_VALUE;
		
		return this.array_1007[this.front_1007];		
	}
	
	int rear_1007() {
		if (isEmpty_1007(this))
			return Integer.MIN_VALUE;
		return this.array_1007[this.rear_1007];
	}
	
	// mencetak elemen antrian
	void display_1007() {
		int i_1007;
		if (front_1007 == rear_1007) {
			System.out.printf("\nAntrian Kosong\n");
			return;
		}
		// kunjungi dari belakang dan cetak
		for (i_1007 = front_1007; i_1007 < rear_1007; i_1007++) {
			System.out.printf(" %d <-- ", array_1007[i_1007]);
		}
		
		return;
	}

}
