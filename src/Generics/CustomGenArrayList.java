package Generics;

import java.util.Arrays;

public class CustomGenArrayList <T extends String>{//T extend string restrivts of entering any number typr
    private Object[]data;
    private static int DEFAULT_SIZE=10;
    private int size=0;
    public CustomGenArrayList(){
        this.data=new Object[DEFAULT_SIZE];
    }
    public void add(T num){
        if(isFull()){
            resize();
        }
        data[size++]=num;
    }

    private void resize() {
        Object[]temp=new Object[data.length*2];
        for(int i=0;i< data.length;i++){
            temp[i]=data[i];
        }
        data=temp;
    }
    public T get(int index){
        return (T)(data[index]);
    }
    private boolean isFull() {
        return size==data.length;
    }
    public T remove(){
        T removed=(T)(data[--size]);
        return removed;
    }
    public int size(){
        return size;
    }
    public void set(int index,T val){
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
        CustomGenArrayList list=new CustomGenArrayList();
//        list.add(3);
//        list.add(89);
//        list.add(9);
//        list.add(96);
//        list.add(90);
        list.add("roshan");

        System.out.println(list);

    }



}