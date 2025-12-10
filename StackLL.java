class Node{
    int data;
    Node next;
    Node (int data){
        this.data=data;
    }
}
public class StackLL {
    Node top = null;
    void push(int data){
        Node newNode = new Node(data);
        if(top==null){
            top =newNode;
            return;
        }
        newNode.next=top;
        top=newNode;
    }

    int pop(int data){

        if (top == null) {
        System.out.println("Stack Underflow (Empty)");
        return -1;
    }

        int del = top.data;
        top = top.next;
        return del;

    }

    int peek(){
         return top.data;
    }
    int isEmpty(){
        if(top == null){
           return 1;
        }
        return 0;
    }
    
    
    void display(){
        if (top == null) {
        System.out.println("Stack is empty");
        return;
    }
    Node temp = top;
    while(temp!=null){
    System.out.print(temp.data + " -> ");
     temp =temp.next;
    

    }
    System.out.print("null");
    }
    public static void main(String[] args) {
  StackLL stack = new StackLL();
     stack.push(8);
     stack.push(8);
     stack.push(18);
     stack.push(90);
     stack.display();

    }
}