package LeetCode;

import java.util.Comparator;

 class SortByRoll {

     public SortByRoll() {

     }

     public  Object  SortByRoll(Object a){
       System.out.print(a);
       return null;

     }
   public String  SortByRoll( String s){
       System.out.println(s);
         return null;
     }
     SortByRoll(int a){
         System.out.println(a);
     }
     SortByRoll(int a,int b){
         System.out.println(a+b);
     }

     public static void main(String[] args) {
       SortByRoll sort=new SortByRoll();
        sort. SortByRoll(null);
        sort. SortByRoll("s");
        sort. SortByRoll(12);
        sort. SortByRoll(12+12);
     }

}
