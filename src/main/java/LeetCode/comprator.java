package LeetCode;

public class comprator {

    public String concat(){
           String space="  ";
        String []in="I am Rajendra, I am a Software professional".split(",");
        String out="";
        for(String in1:in){

            String [] in_1=in1.split(" ");
            for (int i = in_1.length-1; i >= 0; i--) {
                String  inner_out=in_1[i];
                out+=inner_out+space;
            }
            out= out+space;
            out.concat(" , ");
        }
        return out;
    }

    public void student(){
        String name, address;
        int rollNum;

    }

    public static void main(String[] args) {
        comprator test=new comprator();
        String finalFormat=test.concat();
        System.out.println(finalFormat);
    }
}
