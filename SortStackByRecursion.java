import java.util.Stack;

class SortStackUsingRecursion {
    public static void sort(Stack<Integer> stack) {
        if(!stack.isEmpty()) {
            int temp = stack.pop();
            sort(stack);
            insert(stack,temp);
        }
    }
    private static void insert(Stack<Integer> stack, int value) {
        if(stack.isEmpty() || stack.peek()<=value) {
            stack.push(value);
            return;
        }
        int temp=stack.pop();
        insert(stack,value);
        stack.push(temp);
    }
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(15);
        stack.push(12);
        stack.push(44);
        stack.push(21);
        
        sort(stack);
        while(!stack.isEmpty()) {
         System.out.print(stack.pop() +" "); 
        }
    }
}
