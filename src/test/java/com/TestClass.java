package com;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TestClass {

    //in = [2,5,3,1,8,4] -
    // out= [8,5,4,3,2,1]

    public static void main(String[] args) {

        int [] in= {2,5,3,1,8,4};
        Arrays.sort(in);
        
        int temp=0;

        for (int i = 0; i < in.length; i++) {
            //2
            for (int j = i; j < in.length; j++) {
                if (in[i]<=in[j]){
                    //i=2
                    //j =
                    temp=in[j];
                    System.out.print(temp);
                    in[i]=temp;
                }
            }
        }
    }

}
