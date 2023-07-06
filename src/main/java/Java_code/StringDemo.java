package Java_code;

import com.sun.jdi.request.StepRequest;
import org.testng.annotations.Test;

import java.util.*;

public class StringDemo {

    String input="geeksforgeeks";
   // String output="seekg rof seekg";
   int size=input.length()-1;

   @Test(description = " Reverse String")
    public  void reverseString(){
        System.out.println(Integer.toString(size));
       // String[] in=input.split("");
        for (int i =size ; i > 0; i--) {
            char s= input.charAt(i);

            System.out.print(s);
        }

    }
    @Test(description = "swapping the last n first number or char of input")
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
@Test
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
            System.out.printf("empty string : "+ in);
        }
        char[] ch=in.toCharArray();

        for (int i = 0; i < ch.length-1; i+=2) {
            System.out.println("value of i : " +i);
            char team=ch[i];
            ch[i]=ch[i+1];
            ch[i+1]=team;
        }
        System.out.println(ch);
    }

    @Test(description = "duplicate count")
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
            System.out.println("key "+entry.getKey() +" : times " + entry.getValue());

        }
    }

    @Test(description = "finding th vowel from input string ")
    public void vowelFinding(){
        String input = "rajendra";
      Boolean status= input.toLowerCase().matches(".*[aeiou]*.");
        System.out.println(status);
        Map<String,Integer> vowelMap= new HashMap<>();
        if(status=true){
            for (int i = 0; i < input.length(); i++) {
              
            }
        }

    }

    @Test(description = "Random number generator")
    public void randomeNumTest(){
        int[] a={1,3,6,3,43,64,34};
        Random random= new Random();

        System.out.println();
    }
    public static void main(String[] args) {
        StringDemo demo=new StringDemo();
       // demo.reverseString();
    //    demo.getInput();
        demo.swapTwoChar("GeeksforGeeks");
    //demo.repeatedCharCount();
    }
}
