import java.util.Stack;

class StockSpan {
    public static int[] SpanCount(int[] prices) {
        int[] span = new int[prices.length];
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<prices.length; i++) {
            while(!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
                stack.pop();
            }
            span[i] = stack.isEmpty()? i+1 : i-stack.peek();
            stack.push(i);
        }
        return span;
    }

    public static void main(String[] args) {
        int[] prices = {145,125,165,152,251,253,120};
        int[] span = SpanCount(prices);
        for(int s : span) {
            System.out.print(s + " "); 
        }
    }
}
