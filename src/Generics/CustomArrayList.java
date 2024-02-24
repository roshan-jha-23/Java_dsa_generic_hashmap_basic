package Generics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArrayList {
    private int[]data;
    private static int DEFAULT_SIZE=10;
    private int size=0;
    public CustomArrayList(){
        this.data=new int[DEFAULT_SIZE];
    }
    public void add(int num){
        if(isFull()){
            resize();
        }
        data[size++]=num;
    }

    private void resize() {
        int[]temp=new int[data.length*2];
        for(int i=0;i< data.length;i++){
            temp[i]=data[i];
        }
        data=temp;
    }
  public int get(int index){
        return data[index];
  }
    private boolean isFull() {
        return size==data.length;
    }
    public int remove(){
        int removed=data[--size];
        return removed;
    }
    public int size(){
        return size;
    }
    public void set(int index,int val){
      data[index]=val;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
//        ArrayList list=new ArrayList();
        CustomArrayList list=new CustomArrayList();
        list.add(3);
        list.add(89);
        list.add(9);
        list.add(96);
        list.add(90);

        System.out.println(list);

    }



}
