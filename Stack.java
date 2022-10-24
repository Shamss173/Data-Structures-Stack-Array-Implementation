
public class Stack {

    int  capacity;
    int top;
    int ar[];

    Stack(int size) {
        capacity = size;
        top = -1;
        ar = new int[size];
    }

    boolean isEmpty() {
        if(top == -1) return true;
        
        return false;
    }

    boolean isFull() {
        if(top == capacity) return true;
        
        return false; 
    }
    
    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack OverFlow");
        } else {
            ar[++top] = data;
            
        }
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack UnderFlow");
        } 
        else
        {
                int x = ar[top];
                System.out.println(x);
                top--;
        }
        //else {
////            for (int i = 0; i < capacity ; i++) {
////                int x = ar[top];
////                System.out.println(x);
////                top--;
//            }
//        }
    }
    public int peek()
    {
        return top;
    }
    public static void main(String arg[]) {
        Stack stack = new Stack(6);
        stack.isEmpty();
         stack.isFull();
        for (int i = 0; i < 6; i++) {
            stack.push(i);
        }
        stack.pop(); 
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println();
       // System.out.println(stack.peek());
        
    }
}
