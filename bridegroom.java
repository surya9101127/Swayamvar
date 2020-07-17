/*Code for Swayamvar*/
/* P Surya Sampreet*/



import java.util.*;
public class bridegroom{
  public static void main(String []args){
    Scanner sc=new Scanner(System.in);
    Queue<Character> queue=new LinkedList<>();
    Queue<Character> queue1=new LinkedList<>();
    int n=sc.nextInt();
    String str=sc.next();
    String str1=sc.next();
    for(int i=0;i<n;i++){
    	queue.add(str.charAt(i));
      	queue1.add(str1.charAt(i));
    } 
    int i=queue.size();
    while(!queue.isEmpty()&& i>0){
    	if(queue.peek()==queue1.peek()){
        	queue.remove();
          queue1.remove();
          i=queue.size();
        }
      	else{
          char m=queue1.remove();
          queue1.add(m);
          i--;
        }    
    }
    System.out.println(queue.size());
      
  }
    }