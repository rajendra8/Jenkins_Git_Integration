package Java_code;

import java.util.HashMap;
import java.util.Map;

public class Test1 {

    String[] in="how refer are you level".split(" ");

    public void test(){
        StringBuffer sb=new StringBuffer("abcdef");
          String rev=  sb.reverse().toString();
        //System.out.println(rev);
        for(int i=0;i<in.length;i++){
            String s1=in[i];
           // System.out.println(s1);
           sb= new StringBuffer(s1);
            sb.reverse();
          //  System.out.println(sb.toString());
            if(sb.toString().equals(s1)){
                System.out.println("its palindrom :: " +(s1));
                System.out.println();
            }

//             for(int j=s1.length()-1;j<0;j--){
//                 char  revs  =s1.charAt(i);
//                 String s2=Character.toString(revs);
//                 System.out.println(s2);
//                 if(s1.equals(s2)){
//                     System.out.print("its palindrom");
//                 }
//             }
        }
    }

    public void reverseString(){
        String in="Apple";
        char [] inC=in.toCharArray();
        for (int i = in.length()-1; i >=0 ; i--) {
                char c =in.charAt(i);
            System.out.print(c);
        }

    }

    public void testPattern(){
       /* 1
        12
        123
        1245*/

        for (int i = 1; i < 6; i++) {
            //System.out.println(i);
            for (int j = 1; j < i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
    public void duplicate_Word_FromString(){
        String[] in="my name is Rajendra i am indian i like become an deputy collector".split(" ");
            Map<String,Integer>map=new HashMap<>();

            for (int i = 0; i <in.length ; i++) {
                if(map.containsKey(in[i])){
                    map.put(in[i],map.get(in[i])+1);
                }else{
                    map.put(in[i],1);
                }
            }
            for(Map.Entry entry: map.entrySet()){
                System.out.println(" "+  entry.getKey() +" : "+  entry.getValue());


            }
        }

    public void Duplicate_Character_fromString(){
        String in="Hello madam ji";

        HashMap<Character,Integer> map=new HashMap<>();
        for (int i = 0; i < in.length(); i++) {
            if(map.containsKey(in.charAt(i))){
                map.put(in.charAt(i),map.get(in.charAt(i))+1);
            }else {
                map.put(in.charAt(i),1);
            }
        }
        for(Map.Entry entry:map.entrySet()){
            System.out.println(entry.getKey() +": :"+entry.getValue());

        }
    }







    public static void main(String []arg){
        Test1 test =new Test1();
     //   test.duplicate_Word_FromString();
        test.Duplicate_Character_fromString();
    }

}
