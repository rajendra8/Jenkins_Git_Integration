package Java_code;

import com.sun.jdi.request.StepRequest;

import java.util.HashMap;
import java.util.Map;

public class StringDemo {

    String input="geeks for geeks";
   // String output="seekg rof seekg";
   int size=input.length()-1;

    public  void reverseString(){
        System.out.println(Integer.toString(size));
        for (int i =size ; i > 0; i--) {
            char s= input.charAt(i);

            System.out.print(s);
        }

    }
    public void  swapFirstAndLastChar(){
        String [] ip="apple".split("");

        //op=eppla
        int size=ip.length;
        if(size==0){
            System.out.printf("has only one char");
        }
         String temp="";

    }

    // swip first and last char of string
    public String getInput() {
       String in= "Geeksforgeeks";
       if(in.length()<2){
           return in;
       }
       char [] ch=in.toCharArray();

       char tem=ch[0];
       ch[0]=ch[ch.length-1];

       ch[ch.length-1]=tem;

        System.out.print(String.valueOf(ch));

        return String.valueOf(ch);
    }

    public void swapTwoChar(String in){


        if(in==null || in.isEmpty()) {
            System.out.printf(in);
        }
        char[] ch=in.toCharArray();

        for (int i = 0; i < ch.length-1; i+=2) {

            char tem=ch[i];
            ch[i]=ch[i+1];
            ch[i+1]=tem;
        }
        System.out.println(ch);
    }

    public void repeatedCharCount(){
        String in="GeeksforGeeks";
        char[] ch=in.toCharArray();
        int size=ch.length;

        HashMap<Character,Integer>map=new HashMap<>();
        for (int i = 0; i < size; i++) {
            if(map.containsKey(ch[i])){
                map.put(ch[i],map.get(ch[i])+1);
            }else{
                map.put(ch[i],1);
            }
        }
        for(Map.Entry entry:map.entrySet()){
            System.out.println("key "+entry.getKey() +" : value " + entry.getValue());

        }
    }

    public static void main(String[] args) {
        StringDemo demo=new StringDemo();
       // demo.reverseString();
    //    demo.getInput();
     //   demo.swapTwoChar("GeeksforGeeks");
    demo.repeatedCharCount();
    }
}
