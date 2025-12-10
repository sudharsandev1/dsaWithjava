
import java.util.*;
public class QueueArray {

    int size = 40;
    int [] arr;
    int front =-1;
    int rear =-1;
    QueueArray(){
        arr = new int [size];
    }
    void enqueue(int data){
        if(rear==size-1){
            System.out.println("Stack is Overflow");
            return;
        }
        if(front==-1 && rear==-1){
            front++;
            arr[++rear]=data;
            return;
        }
        arr[++rear]=data;
    }
    int dequeue(){
        if(front==-1 || rear==-1 || front > rear){
              System.out.println("Stack is Underflow or Empty");
              return -1;
        }

        int val = arr[front];
        if(front==rear){
            front=-1;
            rear=-1;
        }
        else{
            front++;
        }
        return val;
    }
    int peek(){
        return arr[front];
    }
    int isEmpty(){
         if(front==-1 && rear==-1){
              return 1;
        }
        return 0;
    }
    void displayArray(){
        if(front==-1 || rear==-1){
              System.out.println("Stack is Underflow or Empty");
        }
        for(int i=front;i<=rear;i++){
            System.out.println ( arr[i]+"");
        }
        //new line print
        System.out.println();
    }
    public static void main(String[] args) {
     QueueArray queue =new QueueArray();
     queue.enqueue(8);
   queue.enqueue(18);
      queue.enqueue(81);
     //queue.displayArray();
   
    queue.dequeue();
    queue.displayArray();


    }
}