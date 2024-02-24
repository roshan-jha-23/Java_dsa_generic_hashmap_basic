import java.util.ArrayList;

public class PiorityQueueUsinhHeap {
    ArrayList<Integer> data;
    public PiorityQueueUsinhHeap() {
        data=new ArrayList<>();
    }
    public void add(int val){
    data.add(val);
    upheapify(data.size()-1);
    }
    public void upheapify(int i){
        if(i==0)return;
        int pi=(i-1)/2;
        if(data.get(i)<data.get(pi)){
            int temp=data.get(i);
            int temp2=data.get(pi);
            data.set(i,temp2);
            data.set(pi,temp);
            upheapify(pi);
        }
    }
    public int remove(){
    if(this.size()==0)return -1;
    swap(0,data.size()-1);
     downheapify(0);
     return data.remove(data.size()-1);
    }

    private void downheapify(int pi) {
        int mini=pi;
        int li=2*pi+1;
        if(li< data.size() && data.get(li)<data.get(mini)){
            mini=li;
        }
        int ri=2*pi+2;
        if(ri< data.size() && data.get(ri)<data.get(mini)){
            mini=ri;
        }
        if(mini!=pi){
            swap(pi,mini);
            downheapify(mini);
        }

    }

    private void swap(int i, int j) {

        int temp=data.get(i);
        int temp2=data.get(j);
        data.set(i,temp2);
        data.set(j,temp);
    }

    public int peek(){
        if(this.size()==0)return -1;
        return data.get(0);
    }
    public int size(){
        return data.size()-1;
    }

    public static void main(String[] args) {
        PiorityQueueUsinhHeap obj=new PiorityQueueUsinhHeap();
        obj.add(56);
        obj.add(67);
        obj.add(7);
        System.out.println(obj.peek());
        System.out.println(obj.remove());
    }
}
