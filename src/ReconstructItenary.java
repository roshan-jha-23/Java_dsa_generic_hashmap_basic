import java.util.HashMap;
import java.util.Scanner;

public class ReconstructItenary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        HashMap<String,String> tickets=new HashMap<>();
        for(int i=0;i<n;i++){
            String s1=sc.next();
            String s2=sc.next();
            tickets.put(s1,s2);
        }
        //write your logic
        HashMap<String,Boolean>fmap=new HashMap<>();
        for(String s:tickets.keySet()){
            String dest=tickets.get(s);
            fmap.put(dest,false);
            if(fmap.containsKey(s)==false){
                fmap.put(s,true);
            }
        }
        String src="";
        for(String s:fmap.keySet()){
            if(fmap.get(s)){
                src=s;
                break;
            }
        }
        while(true){
            if(fmap.containsKey(src)){
                System.out.print(src+"->");
               if(src!=""){ src=tickets.get(src);}
            }else{
                System.out.print(src+".");
                break;
            }
        }
    }
}

