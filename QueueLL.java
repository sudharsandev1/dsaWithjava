public class QueueLL {

    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }

    Node front,rear;
    QueueLL(){
        front=null;
        rear=null;
    }
    void enqueue(int data){
        Node newNode=new Node(data);
        if(front==null){
            front=newNode;
            rear=newNode;
        }
        rear.next=newNode;
    }
    int dequeue(){
        if(front==null){
            System.out.println("queue is empty");
        }
        int temp = front.data;
        front=front.next;
        return temp;
    }

    void display(){
         if(front==null){
            System.out.println("queue is empty");
            return;
        }
        Node temp =front;
        while(temp!=null){
            System.out.print(temp.data  +"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
        public static void main(String[] args) {
            QueueLL queue=new QueueLL();
            queue.enqueue(8);
   queue.enqueue(18);
      queue.enqueue(81);
     queue.display();
   
    queue.dequeue();
queue.display();
    }
}