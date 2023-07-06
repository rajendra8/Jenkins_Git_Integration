package Java_code;

import org.testng.annotations.Test;

import java.util.Arrays;

/*
     Listen and silent are anagram bcz charcter is same
*/
public class Anagram_String {

    String in="Silent";
    String in2="Listen";

    public boolean anagramTest(String in,String in2){
       boolean status= false;
      in=  in.toUpperCase();
      in2= in2.toUpperCase();
        char[] c=in.toCharArray();
        char[] d=in2.toCharArray();
        Arrays.sort(c);
        Arrays.sort(d);
       // Arrays.compare(c,d);
        System.out.println(c);
        System.out.println(d);
        if(c.length !=d.length){
            return false;
        }

        for (int i = 0; i <c.length ; i++) {
            if(c[i] !=d[i]){
                return false;
            }
            else {
                return true;
            }
        }
       return status;
    }

    @Test
    public void test(){
      boolean status=  anagramTest("Madam","madam");
        System.out.println(status);
    }
}
