package Generics;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LamdaFunc {
    public static void main(String[] args) {
        ArrayList<Integer>arr=new ArrayList<>();
        for (int i = 0; i <arr.size() ; i++) {
            arr.add(2*i+1);
        }
//        arr.forEach((item)-> System.out.println(item*2));
        Consumer<Integer> fun=(item)-> System.out.println(item*2);
        arr.forEach(fun);
        Operation sum=(a,b)->a + b;
        Operation diff=(a,b)->a-b;

    }

}
interface Operation{
    int op(int a,int b);
}
