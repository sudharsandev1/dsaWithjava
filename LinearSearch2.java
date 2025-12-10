import java.util.*;
class LSString{
   public static int find (String s, char target){
    for (int i=0;i<s.length();i++){
        if(s.charAt(i)==target)
        {
            return i;
        }
    }
    return -1;
    
   }
}


public class LinearSearch2 {
    public static void main(String[] args) {
    
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the String : ");
    String str = sc.nextLine();
     System.out.println("Enter The Target : ");
      char ch = sc.next().charAt(0);
      int index = LSString.find(str,ch);
      if(index !=-1){
        System.out.println( ch +" is find the index in the given char in position "+ index);
      }
      else{
                System.out.println( "Sorry Bro this " + ch +" not found  this string ");

      }

    }
}