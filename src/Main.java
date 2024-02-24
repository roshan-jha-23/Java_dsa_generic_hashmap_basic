import java.io.*;
import java.util.*;

public class Main {
    public static void findCount(HashMap<String,String>map){
        HashMap<String,HashSet<String>>tree=new HashMap<>();
        String ceo="";
        for(String emp:map.keySet()){
            String man=map.get(emp);
            if(man.equals(emp)){
                ceo=man;
            }else{
                if(tree.containsKey(man)){
                    HashSet<String> emps=tree.get(man);
                    emps.add(emp);
                }else{
                    HashSet<String> emps=new HashSet<>();
                    emps.add(emp);
                    tree.put(man,emps);
                }
            }
        }
        HashMap<String,Integer>fmap=new HashMap<>();
        getCount(tree,ceo,fmap);
        for(String s:fmap.keySet()){
            System.out.println(s+" "+fmap.get(s));
        }

    }
    public static int getCount(HashMap<String,HashSet<String>>tree, String man,HashMap<String,Integer>fmap){
        if(tree.containsKey(man)==false){
            fmap.put(man,0);
            return 1;
        }
        int size=0;
        for(String emp:tree.get(man)){
            int noOfemp=getCount(tree,emp,fmap);
            size+=noOfemp;
        }
        fmap.put(man,size);
        return size+1;
    }

    public static void main   (String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        HashMap<String,String>map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(sc.next(),sc.next());
        }
        findCount(map);
        //write your code here
    }

}
