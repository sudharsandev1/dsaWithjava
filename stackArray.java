import java.util.*;
public class stackArray {

    int size;
    int top =-1;
    int []arr;
    stackArray(){
         size = 40;
         arr = new int [size];
    }
    void push (int data){
        if (top == size-1){
         System.out.println("Stack Overflow");
         return;
        }
        arr[top++]=data;
        
    }
    void display(){
        for (int i=0 ; i<=top;i++ )
        {
        System.out.println(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
     stackArray stack = new stackArray();
     stack.push(8);
     stack.push(8);
     stack.push(18);
     stack.push(90);
     stack.display();

    }
}