package Java_code;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArrayDemo {

   int [] array={1,2,4,5,6,3,764,2,53};


   @Test
    public void arrayTest(){
       int length= array.length;
       Arrays.sort(array);
   }

   public void repeatation(){
      Map<Integer,Integer>map=new HashMap<>();

      for(int a:array){
         if(map.containsValue(a)){

         }
      }


   }
}
