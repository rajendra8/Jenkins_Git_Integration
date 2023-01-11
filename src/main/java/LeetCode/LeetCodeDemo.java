package LeetCode;

public class LeetCodeDemo {

    public void arrayRotation(){
        int [] in={1,2,4,5,6,7,8};
        int k=3;
        //op=6,7,8,1,2,3,4,5
     int[] result=new int[in.length];
        for (int i = 0; i <k ; i++) {
          result[i]=in[in.length-k+i];
        }

        int j=0;
        for (int i = k; i < in.length; i++) {
            result[i]=in[j];
            j++;

        }
        for(int a:result)
        System.out.print(a);
    }

    //compair and assign them into order
    public void comparator_Student(){
        String Name;
        String RollNum;
        String Location;



    }
    public static void main(String[] args) {
        LeetCodeDemo test=new LeetCodeDemo();
        test.arrayRotation();

    }

}
