import java.util.Collections;
import java.util.PriorityQueue;

public class MedianOfPriority {

    PriorityQueue<Integer>left;
    PriorityQueue<Integer>right;
    public MedianOfPriority() {
        left=new PriorityQueue<>(Collections.reverseOrder());
        right=new PriorityQueue<>();
    }
    public void add(int val){
     if(right.size()>0 && val>right.peek()){
         right.add(val);
     }
     else{
         left.add(val);
     }
     if(left.size()-right.size()==2)right.add(left.remove());
     else if (left.size()- right.size()==-2) {
         left.add(right.remove());
     }
    }
    public int remove(){
        if(this.size()==0)return -1;
        if(left.size()>=right.size()){
            return left.remove();
        }else{
            return right.remove();
        }
    }
    public int peek(){
        if(this.size()==0)return -1;
      if(left.size()>=right.size()){
         return left.peek();
      }else{
          return right.peek();
      }
    }
    public int size(){
        return left.size()+right.size();
    }

    public static void main(String[] args) {
        MedianOfPriority obj=new MedianOfPriority();
        obj.add(23);
        obj.add(25);
        obj.add(5);
        obj.add(20);

        System.out.println(obj.peek());
        System.out.println(obj.size());
    }
}
