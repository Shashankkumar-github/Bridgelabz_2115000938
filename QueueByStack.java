import java.util.Stack;

class QueueByStacks {
    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();

    public void enqueue(int value) {
        stack1.push(value);
    }

    public int dequeue() {
        if(stack2.isEmpty()) {
            while(!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.isEmpty()?-1:stack2.pop();
    }

    public static void main(String[] args) {
        QueueByStacks queue = new QueueByStacks();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println(queue.dequeue()); 
        System.out.println(queue.dequeue()); 
    }
}
