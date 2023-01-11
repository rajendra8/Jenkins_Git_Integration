package com.Intigration.app;

import org.testng.annotations.Test;

public class HelloWord {


    String []in= "Hello world".split(" ");

    @Test
    public void test(){
        for (int i= in.length-1;i>=0;i--){
            System.out.print( in[i]);
            System.out.print(" ");
        }
    }
}
