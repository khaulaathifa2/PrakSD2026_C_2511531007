package pekan4_2511531007;

public class QueueArrayDriver_2511531007 {

	public static void main(String[] args) {
		QueueArray_2511531007 queue_1007 = new QueueArray_2511531007(1000);
		queue_1007.enqueue_1007(10);
		queue_1007.enqueue_1007(20);
		queue_1007.enqueue_1007(30);
		queue_1007.enqueue_1007(40);
		System.out.println("Item di depan " + queue_1007.front_1007());
		System.out.println("Item paling belakang " + queue_1007.rear_1007());
		System.out.println("tampilan queue");
		queue_1007.display_1007();
		System.out.println();
		System.out.println(queue_1007.dequeue_1007() + " dihapus dari queue");
		System.out.println("Item di depan: " + queue_1007.front_1007());
		System.out.println("Item di belakang: " + queue_1007.rear_1007());
		System.out.println("tampilan queue setelah satu data dihapus");
		queue_1007.display_1007();
	}

}
