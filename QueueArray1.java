
import java.util.*;
public class QueueArray1 {

    int size = 40;
    int [] arr;
    // int front =-1;
    int rear =-1;
    QueueArray1(){
        arr = new int [size];
    }
    void enqueue(int data){
        if(rear==size-1){
            System.out.println("Stack is Overflow");
            return;
        }
        if( rear==-1){
            
            arr[++rear]=data;
            return;
        }
        arr[++rear]=data;
    }
    int dequeue(){
        if(rear==-1){
              System.out.println("Stack is Underflow or Empty");
              return -1;
        }

        int val = arr[0];
        for(int i=1;i<=rear;i++){
            arr[i-1]=arr[i];
        }
        rear--;
        return val;
    }
    int peek(){
        return arr[0];
    }
    int isEmpty(){
         if(rear==-1){
              return 1;
        }
        return 0;
    }
    void displayArray(){
        if(rear==-1){
              System.out.println("Stack is Underflow or Empty");
        }
        for(int i=0;i<=rear;i++){
            System.out.println ( arr[i]+"");
        }
        //new line print
        System.out.println();
    }
    public static void main(String[] args) {
     QueueArray1 queue =new QueueArray1();
     queue.enqueue(8);
   queue.enqueue(18);
      queue.enqueue(81);
     //queue.displayArray();
   
    queue.dequeue();
    queue.displayArray();


    }
}