/*
* Deque can be used as a queue (FIFO - first in first out) or a stack (LIFO - last in first out)
* when Deque is used as a Stack, elements are pushed and popped from the beginning of the deque;
* when Deque is used as a queue, elements are added at the end of the deque, and removed from the beginning.
*
* .push(x) and .pop() are stack(Deque) specific; and cannot be used on queues (Queue)
* .remove() and .poll() work well whether a Deque is used as a queue or a stack
*
*/

public class Solution {

    private Queue<Character> queue = new ArrayDeque<>();
    private Deque<Character> stack = new ArrayDeque<>();

    void pushCharacter(char ch) {
		/*
		* .add(ch) or .offer(ch) equivalent to addLast(x) or .offerLast(x);
		* .push(x) equivalent to .addFirst(x);
		*/
        this.stack.push(ch);    // .addFirst(x) and .offerFirst(x) work too
    }

    void enqueueCharacter(char ch) {
        this.queue.add(ch);    // .offer(ch) works too
    }

    char popCharacter() {
        return this.stack.pop();	// .remove() or .poll() works too
    }

    char dequeueCharacter() {
        return this.queue.remove();		// .poll() works too
    }
}
