package com.Intigration.app;

import org.testng.annotations.Test;

public class ArraySorting {

   // A = [[3,4,5],[3,1,7],[6,5,7],[10,33,1]]
   // B = [10,1,33]


    @Test
    public void sort(){
        int [][] in={{3,4,5},{3,1,7},{6,5,7},{10,33,1}};
          int []in2={10,1,33};
          int size=in.length;
          int size2=in[0].length;
        System.out.println(Integer.toString(size));
        System.out.println(Integer.toString(size2));

          for(int i=0;i<in.length;i++){

              for(int j=0;j<in[0].length;j++){
                  if(in[i][j]==in2[j]){
                      System.out.println("its true "+ i);

                  }
              }
          }
    }
}
