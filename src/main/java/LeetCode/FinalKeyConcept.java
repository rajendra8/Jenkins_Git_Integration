package LeetCode;

import org.testng.annotations.Test;

public class FinalKeyConcept {
     int a=10;
    public void finalArray() {
        final int array[]={1,2,4,3,6,7};
        System.out.println(array[1]);

        for (int a:array) {
            System.out.print(a);
        }
        array[1]=8;
        System.out.println(array[1]);
    }

    /**java: cannot assign a value to final variable abc**/
    @Test
    public void finalObjectRef(){
      final FinalKeyConcept abc=new FinalKeyConcept();
        FinalKeyConcept abc1 =new FinalKeyConcept();
     //   abc=abc1;
        System.out.println(abc.a);
    }
}
