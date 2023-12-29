import java.util.Stack;

class MyQueue {
    Stack<Integer> helper;
    Stack<Integer> main;

    public MyQueue() {
        helper = new Stack<>();
        main = new Stack<>();
    }

    public void push(int x) {
        if (main.isEmpty()) {
            main.push(x);
        }
        else {
            while (main.size() != 0) {
                helper.push(main.pop());
            }
            helper.push(x);
            while (helper.size() != 0) {
                main.push(helper.pop());
            }
        }
    }

    public int pop() {
        return main.pop();
    }

    public int peek() {
        return main.peek();
    }

    public boolean empty() {
        return main.size() == 0;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */