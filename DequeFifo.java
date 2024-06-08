package Deque;

		import java.util.LinkedList;

		public class DequeFifo<e> {
		    private LinkedList<e> queue1;
		    private LinkedList<e> queue2;

		    public DequeFifo() {
		        queue1 = new LinkedList<>();
		        queue2 = new LinkedList<>();
		    }

		    public void pushFront(e item) {
		        queue1.addFirst(item);
		    }

		    public void pushBack(e item) {
		        queue2.addLast(item);
		    }

		    public e popFront() {
		        if (!queue1.isEmpty()) {
		            return queue1.removeFirst();
		        } else if (!queue2.isEmpty()) {
		            while (!queue2.isEmpty()) {
		                queue1.addFirst(queue2.removeLast());
		            }
		            return queue1.removeFirst();
		        } else {
		            throw new RuntimeException("Deque is empty");
		        }
		    }

		    public e popBack() {
		        if (!queue2.isEmpty()) {
		            return queue2.removeLast();
		        } else if (!queue1.isEmpty()) {
		            while (!queue1.isEmpty()) {
		                queue2.addLast(queue1.removeFirst());
		            }
		            return queue2.removeLast();
		        } else {
		            throw new RuntimeException("Deque is empty");
		        }
		    }

		    public static void main(String[] args) {
		    	DequeFifo<Integer> deque = new DequeFifo<>();
		        deque.pushFront(50);
		        deque.pushBack(20);
		        deque.pushFront(60);
		        System.out.println(deque.popBack());  
		        System.out.println(deque.popFront()); 
		        System.out.println(deque.popFront()); 
		    }
		


	}

