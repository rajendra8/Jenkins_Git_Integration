import org.testng.annotations.Test;

import javax.swing.*;

public class Ajio {

    // Input: arr[] = {1, 4, 20, 3, 10, 5}, sum = 33
    //{20,3,10}
    public void arraySum(int[] in, int sum){

        sum =0;

        for (int i = 0; i < in.length; i++) {

            for (int j = 0; j < in.length; j++) {

            }
            if(in[i]<sum){
                System.out.println("sum is less then num");
            }
            else {
                sum =sum+in[i];
            }

            i++;
        }
    }


    @Test
    public void test(){
        int []array= {1, 4, 20, 3, 10, 5};
        arraySum(array,33);
    }

}
