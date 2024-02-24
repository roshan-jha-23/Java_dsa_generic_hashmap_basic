import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class PriorityQUeueS {
    public static void main(String[] args) {
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());//Collections.reverseOrder() it will take out hieghest of all
        Scanner sc=new Scanner(System.in);
        int [] arr=new int[10];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter mark");
           arr[i] =sc.nextInt();
        }


        for(int i:arr){
            pq.add(i);
        }
        System.out.println("the lowest mark is"+pq.peek());
    }
}
